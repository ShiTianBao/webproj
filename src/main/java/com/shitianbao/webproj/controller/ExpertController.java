package com.shitianbao.webproj.controller;

import com.shitianbao.webproj.common.CommonMsg;
import com.shitianbao.webproj.persistent.entity.ExpertToProject;
import com.shitianbao.webproj.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expert")
public class ExpertController {

    @Autowired
    ExpertService expertService;

    @GetMapping("/projList")
    public CommonMsg getProjList() {
        return expertService.getProjList();
    }

    @PostMapping("/comment")
    public CommonMsg comment(ExpertToProject expertToProject) {
        expertService.comment(expertToProject);
        return new CommonMsg();
    }
}
