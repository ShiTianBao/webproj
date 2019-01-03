package com.shitianbao.webproj.controller;

import com.shitianbao.webproj.common.CommonResult;
import com.shitianbao.webproj.util.FileUpload;
import com.shitianbao.webproj.util.StaticUtil;
import com.szhw.webproj.persistent.entity.Project;
import com.szhw.webproj.persistent.entity.User;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.szhw.webproj.common.GlobalConstant.SESSION_ATTR_KEY;

@Controller
public class ProjectDeclareController {

    /**
     * @function 单文件上传
     * @param file
     * @return
     */
    @RequestMapping("/upload")
    @ResponseBody
    public CommonResult UploadImage(@RequestParam(value = "file", required = false) MultipartFile file){
        System.out.println("file page");
        CommonResult cm = new CommonResult();
        if(file == null){
            cm.setCode(0);
            cm.setMsg("文件上传失败");
            return cm;
        }else{
            String end = FileUpload.fileOne(file, StaticUtil.SAVE_URL, "01");
            cm.setCode(1);
            cm.setMsg("文件上传成功");
            return cm;
        }
    }


    @PostMapping("/declare")
    @ResponseBody
    public CommonResult projectDeclare(HttpSession session, Project pt) {
        CommonResult cm = new CommonResult();
        System.out.println("ok");
        System.out.println(pt.toString());
        User user = (User) session.getAttribute(SESSION_ATTR_KEY);
        System.out.println(user.getId());
        cm.setCode(1);
        return cm;
    }
}
