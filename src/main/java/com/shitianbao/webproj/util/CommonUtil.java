package com.shitianbao.webproj.util;

import com.shitianbao.webproj.common.CommonMsg;
import com.shitianbao.webproj.persistent.entity.Proj;
import com.shitianbao.webproj.persistent.repository.ProjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonUtil {

    @Autowired
    ProjRepository projRepository;


    public CommonMsg getProjList() {
        List<Proj> list = projRepository.findAll();
        CommonMsg cm = new CommonMsg();
        for(Proj proj : list) {
            if(proj.getFileState().equals("未提交")) {
                proj.setFileUrl("未提交");
            }else {
                proj.setFileUrl("<a href='"+proj.getFileUrl()+"'>点击下载</a>" );
            }
        }
        cm.setData(list);
        return cm;
    }
}
