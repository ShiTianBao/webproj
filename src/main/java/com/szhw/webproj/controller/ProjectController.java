package com.szhw.webproj.controller;

import com.szhw.webproj.common.GlobalConstant;
import com.szhw.webproj.persistent.repository.ProjectRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
//        List<ProjectTo> projectToList = projectRepository.listUserProject(user.getId());
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
}
