package com.szhw.webproj.controller;

import com.szhw.webproj.persistent.project.Project;
import com.szhw.webproj.persistent.project.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HJF
 * @date 2018/11/12 16:28
 */
@RestController
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/project/{id}")
    public Project getProject(@PathVariable("id")  String id){
        Project project = projectRepository.getOne(id);
        return project;
    }

    @PostMapping("/project")
    public Project insertProject(Project project){
       return projectRepository.save(project);
    }
}
