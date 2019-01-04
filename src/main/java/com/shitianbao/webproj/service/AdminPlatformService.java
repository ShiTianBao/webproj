package com.shitianbao.webproj.service;

import com.shitianbao.webproj.common.CommonMsg;
import com.shitianbao.webproj.persistent.entity.ExpertToProject;
import com.shitianbao.webproj.persistent.entity.Proj;
import com.shitianbao.webproj.persistent.entity.Type;
import com.shitianbao.webproj.persistent.repository.ExpertToProjectRepository;
import com.shitianbao.webproj.persistent.repository.ProjRepository;
import com.shitianbao.webproj.persistent.repository.TypeRepository;
import com.shitianbao.webproj.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminPlatformService {

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    ProjRepository projRepository;

    @Autowired
    ExpertToProjectRepository expertToProjectRepository;

    @Autowired
    CommonUtil commonUtil;

    public void addType(Type type) {
        typeRepository.save(type);
    }

    public CommonMsg getFirstList() {
        return commonUtil.getProjList();
    }

    public void updateProjState(Proj proj, String state) {
        projRepository.updateProjState(state, proj.getId());
    }

    public void addExpertToProject(ExpertToProject expertToProject) {
        expertToProjectRepository.save(expertToProject);
    }

    public void distributState(ExpertToProject expertToProject) {
        projRepository.updateProjState("立项评审中", expertToProject.getProjectId());
    }

    public void makeProject(Proj proj) {
        projRepository.updateProjState("已立项", proj.getId());
    }

    public void unmakeProject(Proj proj) {
        projRepository.updateProjState("不立项", proj.getId());
    }

}
