package com.shitianbao.webproj.service;

import com.shitianbao.webproj.persistent.entity.Expert;
import com.shitianbao.webproj.persistent.entity.ExpertToProject;
import com.shitianbao.webproj.persistent.entity.Proj;
import com.shitianbao.webproj.persistent.entity.Type;
import com.shitianbao.webproj.persistent.repository.ExpertRepository;
import com.shitianbao.webproj.persistent.repository.ExpertToProjectRepository;
import com.shitianbao.webproj.persistent.repository.ProjRepository;
import com.shitianbao.webproj.persistent.repository.TypeRepository;
import com.szhw.webproj.persistent.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    ProjRepository projRepository;

    @Autowired
    ExpertRepository expertRepository;

    @Autowired
    ExpertToProjectRepository expertToProjectRepository;

    public List<Type> getTypeList() {
        List<Type> typeList = typeRepository.findAll();
        return typeList;
    }

    public List<Expert> getExpertList() {
        List<Expert> expertList = expertRepository.findAll();
        return expertList;
    }

    public void addProj(Proj proj, User user) {
        int id = Integer.parseInt(proj.getProjectType());
        Type type = typeRepository.getOne(id);
        proj.setProjectType(type.getProjectType());
        proj.setState("未初审");
        proj.setFileState("已提交");
        proj.setHeader(user.getAccount());
        proj.setFileUrl(user.getAccount()+"-"+id+"-"+"项目申请书");
        if(proj.getNumber4()!=null) {
            proj.setNumberCount(4);
        }else if(proj.getNumber3()!=null) {
            proj.setNumberCount(3);
        }else if(proj.getNumber2()!=null) {
            proj.setNumberCount(2);
        }else if(proj.getNumber1()!=null) {
            proj.setNumberCount(1);
        }else {
            proj.setNumberCount(0);
        }
        projRepository.save(proj);
    }



}
