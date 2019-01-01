package com.shitianbao.webproj.controller;

import com.shitianbao.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.User;
import com.szhw.webproj.persistent.entity.to.ProjectTo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import static com.szhw.webproj.common.GlobalConstant.SESSION_ATTR_KEY;

@RestController
@RequestMapping("/faculty")
public class ProjectDeclareController {

    @PostMapping("/declare")
    @ResponseBody
    public CommonResult projectDeclare(HttpSession session, ProjectTo pt) {
        CommonResult cm = new CommonResult();
        System.out.println("ok");
        System.out.println(pt.toString());
        User user = (User) session.getAttribute(SESSION_ATTR_KEY);
        System.out.println(user.getId());
        cm.setCode(1);
        return cm;
    }
}
