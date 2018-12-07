package com.szhw.webproj.controller;

import com.szhw.webproj.persistent.entity.Project;
import com.szhw.webproj.persistent.repository.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author HJF
 * @date 2018/11/12 16:28
 */
@RequestMapping("/project")
@RestController
public class ProjectController{
    @Resource
    ProjectRepository projectRepository;

    @GetMapping("/get")
    public Project getProject(Integer id){
        Optional<Project> project = projectRepository.findById(id);
        return project.orElse(null);
    }

    @GetMapping("/project")
    public Project insertProject(Project project){
       return projectRepository.save(project);
    }
}
