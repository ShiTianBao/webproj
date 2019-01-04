package com.szhw.webproj.controller;

import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.common.GlobalConstant;
import com.szhw.webproj.persistent.entity.Project;
import com.szhw.webproj.persistent.entity.User;
import com.szhw.webproj.persistent.repository.ProjectRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author HJF
 * @date 2018/11/12 16:28
 */
@RequestMapping("/project")
@RestController
public class ProjectController implements GlobalConstant {
    @Resource
    ProjectRepository projectRepository;

//    @GetMapping("/list")
//    public CommonResult listUserProject(HttpSession session) {
//        CommonResult result = new CommonResult();
//        User user = (User) session.getAttribute(SESSION_ATTR_KEY);
//        List<Project> projectToList = projectRepository.listUserProject(user.getId());
//        result.setData(projectToList);
//        return result;
//    }

    //    @GetMapping("/get")
//    public Project getProject(Integer id) {
//        Optional<Project> project = projectRepository.findById(id);
//        return project.orElse(null);
//    }
//
//    @GetMapping("/project")
//    public Project insertProject(Project project) {
//        return projectRepository.save(project);
//    }
    @PostMapping("/submit")
    public CommonResult submitProject(Project project, HttpSession session) {
        CommonResult result = new CommonResult();
        addProject(result, session, project, PROJECT_STATE_WAITE_FIRST_CHECK);
        return result;
    }

    @PostMapping("/save")
    public CommonResult saveProject(Project project, HttpSession session) {
        CommonResult result = new CommonResult();
        addProject(result, session, project, PROJECT_STATE_NOT_SUBMIT);
        return result;
    }

    private void addProject(CommonResult result, HttpSession session, Project project, int stateId) {
        project.setStateId(stateId);
        Object object = session.getAttribute(SESSION_ATTR_KEY);
        if (null == object) {
            result.setCode(CODE_USER_NOT_LOGIN);
            result.setMessage("请先登录");
            return;
        }
        User user = (User) object;
        project.setHeaderId(user.getId());
        projectRepository.saveAndFlush(project);
    }
}
