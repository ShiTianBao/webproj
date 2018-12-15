package com.szhw.webproj.controller;

import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.common.GlobalConstant;
import com.szhw.webproj.persistent.entity.Role;
import com.szhw.webproj.persistent.repository.RoleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HJF
 * @date 2018/12/11 13:18
 */
@RestController
@RequestMapping("/role")
public class RoleController implements GlobalConstant {
    @Resource
    RoleRepository roleRepository;

    @GetMapping("/list")
    public CommonResult listRoles() {
        CommonResult result = new CommonResult();
        result.setData(roleRepository.findAll());
        return result;
    }

    @PostMapping("/add")
    public CommonResult addRole(Role role) {
        CommonResult result = new CommonResult();
        if (role.getRoleName() == null) {
            result.setCode(CODE_PARAM_MISS);
            result.setMessage("参数缺失");
            return result;
        }
        roleRepository.saveAndFlush(role);
        return result;
    }

    @PostMapping("/delete")
    public CommonResult deleteRole(Integer id) {
        CommonResult result = new CommonResult();
        if (id == null) {
            result.setCode(CODE_PARAM_MISS);
            result.setMessage("参数缺失");
            return result;
        }
        roleRepository.deleteById(id);
        return result;
    }
}
