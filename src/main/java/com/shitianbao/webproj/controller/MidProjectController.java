package com.shitianbao.webproj.controller;

import com.shitianbao.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.Project;
import com.szhw.webproj.persistent.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mid-project")
public class MidProjectController {

    @Autowired
    ProjectRepository projectRepository;

    public CommonResult getList() {
        CommonResult result = new CommonResult();
        List<Project> projectList= projectRepository.findAll();

        return result;
    }
}
