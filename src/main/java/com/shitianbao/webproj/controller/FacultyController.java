package com.shitianbao.webproj.controller;

import com.shitianbao.webproj.common.CommonMsg;
import com.shitianbao.webproj.persistent.entity.ExpertToProject;
import com.shitianbao.webproj.persistent.entity.Proj;
import com.shitianbao.webproj.persistent.entity.Type;
import com.shitianbao.webproj.service.FacultyService;
import com.shitianbao.webproj.util.FileUpload;
import com.shitianbao.webproj.util.StaticUtil;
import com.szhw.webproj.persistent.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

import static com.szhw.webproj.common.GlobalConstant.SESSION_ATTR_KEY;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    FacultyService facultyService;

    @GetMapping("/declareList")
    public CommonMsg getList() {
        CommonMsg msg = new CommonMsg(facultyService.getTypeList());
        return msg;
    }

    @PostMapping("/fileUpload")
    public CommonMsg fileUpload(@RequestParam(value = "file", required = false) MultipartFile file, Type type, HttpSession session) {

        User user = (User) session.getAttribute(SESSION_ATTR_KEY);
        CommonMsg cm = new CommonMsg();
        if(file == null){
            cm.setCode(0);
            cm.setMsg("文件上传失败");
            return cm;
        }else{
            String end = FileUpload.fileOne(file, StaticUtil.SAVE_URL, user.getAccount()+"-"+type.getId()+"-"+"项目申请书");
            cm.setCode(1);
            cm.setMsg("文件上传成功");
            return cm;
        }
    }

    @PostMapping("/declare")
    public CommonMsg declare(Proj proj, HttpSession session) {
        System.out.println(proj.toString());
        User user = (User) session.getAttribute(SESSION_ATTR_KEY);
        facultyService.addProj(proj, user);
        return new CommonMsg();
    }

    @GetMapping("/expertList")
    public CommonMsg getExpertList() {
        CommonMsg cm = new CommonMsg(facultyService.getExpertList());
        return cm;
    }


}
