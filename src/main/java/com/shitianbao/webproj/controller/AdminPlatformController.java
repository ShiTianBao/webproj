package com.shitianbao.webproj.controller;

import com.shitianbao.webproj.common.CommonMsg;
import com.shitianbao.webproj.persistent.entity.ExpertToProject;
import com.shitianbao.webproj.persistent.entity.Proj;
import com.shitianbao.webproj.persistent.entity.Type;
import com.shitianbao.webproj.service.AdminPlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin_platform")
public class AdminPlatformController {

    @Autowired
    AdminPlatformService adminPlatformService;

    @PostMapping("/release")
    @ResponseBody
    public CommonMsg release(Type type) {
        System.out.println(type.toString());
        adminPlatformService.addType(type);
        return new CommonMsg();
    }

    @GetMapping("/firstList")
    @ResponseBody
    public CommonMsg firstList() {
        return adminPlatformService.getFirstList();
    }

    @PostMapping("/firstPass")
    public CommonMsg firstPass(Proj proj) {
        System.out.println(proj.toString());
        CommonMsg cm = new CommonMsg();
        if(proj.getState().equals("未初审")) {
            adminPlatformService.updateProjState(proj, "初审通过");
            cm.setCode(0);
            cm.setMsg("success");
        }else {
           cm.setCode(-1);
           cm.setMsg("error");
        }
        return cm;
    }

    @PostMapping("/distribut")
    public CommonMsg distribut(ExpertToProject expertToProject) {
        adminPlatformService.addExpertToProject(expertToProject);
        adminPlatformService.distributState(expertToProject);
        return new CommonMsg();
    }

    @PostMapping("/makeProject")
    public CommonMsg makeProject(Proj proj) {
        adminPlatformService.makeProject(proj);
        return new CommonMsg();
    }

    @PostMapping("/makeProject")
    public CommonMsg unmakeProject(Proj proj) {
        adminPlatformService.unmakeProject(proj);
        return new CommonMsg();
    }

}
