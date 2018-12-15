package com.szhw.webproj.controller;

import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.Specialty;
import com.szhw.webproj.persistent.repository.SpecialtyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HJF
 * @date 2018/12/15 14:28
 */
@RestController
@RequestMapping("/specialty")
public class SpecialtyController {
    @Resource
    SpecialtyRepository specialtyRepository;

    @GetMapping("/list")
    public CommonResult listSpecialties() {
        CommonResult result = new CommonResult();
        List<Specialty> specialtyList = specialtyRepository.findAll();
        result.setData(specialtyList);
        return result;
    }
}
