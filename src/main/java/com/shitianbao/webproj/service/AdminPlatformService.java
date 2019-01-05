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

    public void midRule(Type type) {
        typeRepository.updateMidRuleAndMidTime(type.getMidTime(), type.getMidRule(), type.getId());
    }

    public void finalRule(Type type) {
        typeRepository.updateFinalRuleAndFinalTime(type.getFinalTime(), type.getFinalRule(), type.getId());
    }

    public CommonMsg getMidProjList() {
        CommonMsg cm = new CommonMsg();
        List<Proj> projList = projRepository.findAllByState("已立项");
        cm.setData(projList);
        return cm;
    }

    public void midPass(Proj proj) {
        projRepository.updateProjState("中期检查通过", proj.getId());
    }

    public CommonMsg getFinalProjList() {
        CommonMsg cm = new CommonMsg();
        List<Proj> projList = projRepository.findAllByState("中期检查通过");
        cm.setData(projList);
        return cm;
    }

    public void finalPass(Proj proj) {
        projRepository.updateProjState("已结题", proj.getId());
    }

    public void midRefuse(Proj proj) {
        projRepository.updateProjState("中期检查待整改", proj.getId());
        projRepository.updateProjMidReason(proj.getMidReason(), proj.getId());
    }

    public void finalRefuse(Proj proj) {
        projRepository.updateProjState("结题验收待整改", proj.getId());
        projRepository.updateProjFinalReason(proj.getFinalReason(), proj.getId());
    }

}
