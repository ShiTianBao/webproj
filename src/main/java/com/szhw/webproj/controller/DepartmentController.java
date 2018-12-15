package com.szhw.webproj.controller;

import com.szhw.webproj.common.GlobalConstant;
import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.Department;
import com.szhw.webproj.persistent.repository.DepartmentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HJF
 * @date 2018/12/11 13:20
 */
@RestController
@RequestMapping("/dep")
public class DepartmentController implements GlobalConstant {
    @Resource
    DepartmentRepository departmentRepository;

    @GetMapping("/list")
    public CommonResult listDepartments() {
        CommonResult result = new CommonResult();
        result.setData(departmentRepository.findAll());
        return result;
    }

    @PostMapping("/add")
    public CommonResult addDep(Department department) {
        CommonResult result = new CommonResult();
        if (department.getDepName() == null) {
            result.setCode(CODE_PARAM_MISS);
            result.setMessage("参数缺失");
            return result;
        }
        department.setId(null);
        departmentRepository.saveAndFlush(department);
        return result;
    }

    @PostMapping("/delete")
    public CommonResult delDep(Integer id) {
        CommonResult result = new CommonResult();
        if (id == null) {
            result.setCode(CODE_PARAM_MISS);
            result.setMessage("参数缺失");
            return result;
        }
        departmentRepository.deleteById(id);
        return result;
    }
}
