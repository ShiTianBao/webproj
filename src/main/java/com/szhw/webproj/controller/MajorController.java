package com.szhw.webproj.controller;

import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.Major;
import com.szhw.webproj.persistent.repository.MajorRepository;
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
@RequestMapping("/major")
public class MajorController {
    @Resource
    MajorRepository majorRepository;

    @GetMapping("/list")
    public CommonResult listSpecialties() {
        CommonResult result = new CommonResult();
        List<Major> majorList = majorRepository.findAll();
        result.setData(majorList);
        return result;
    }
}
