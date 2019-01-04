package com.shitianbao.webproj.service;


import com.shitianbao.webproj.common.CommonMsg;
import com.shitianbao.webproj.persistent.entity.ExpertToProject;
import com.shitianbao.webproj.persistent.repository.ExpertToProjectRepository;
import com.shitianbao.webproj.persistent.repository.ProjRepository;
import com.shitianbao.webproj.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExpertService {

    @Autowired
    ProjRepository projRepository;

    @Autowired
    CommonUtil commonUtil;

    @Autowired
    ExpertToProjectRepository expertToProjectRepository;



    public CommonMsg getProjList() {
        return commonUtil.getProjList();
    }

    public CommonMsg comment(ExpertToProject expertToProject) {
        expertToProjectRepository.updateScoreAndComment(expertToProject.getScore(), expertToProject.getComment(), expertToProject.getProjectId());
        projRepository.updateProjState("立项评审完成", expertToProject.getProjectId());
        return null;
    }

}
