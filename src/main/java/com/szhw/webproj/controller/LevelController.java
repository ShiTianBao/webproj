package com.szhw.webproj.controller;

import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.Level;
import com.szhw.webproj.persistent.repository.LevelRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author HJF
 * @date 2018/12/15 13:49
 */
@RestController
@RequestMapping("/level")
public class LevelController {
    @Resource
    LevelRepository levelRepository;

    @GetMapping("/list")
    public CommonResult listLevels() {
        CommonResult result = new CommonResult();
        List<Level> levelList = levelRepository.findAll(Sort.by(Sort.Order.asc("code")));
        result.setData(levelList);
        return result;
    }
}
