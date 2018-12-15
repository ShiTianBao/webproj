package com.szhw.webproj.persistent.entity.to;

import com.szhw.webproj.persistent.entity.Project;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

/**
 * @author HJF
 * @date 2018/12/14 18:45
 */
@Entity
@NamedQuery(name = "PersonTo.listUserProject",
        query = "select p.id,p.projectName,l.level,s.state,u.username as header,p.specialty " +
                "from Project p,Level l,State s,User u " +
                "where p.headerId = ?1 " +
                "or p.id in (select projectId from Members where userId = ?1) " +
                "and p.levelId = l.id " +
                "and p.stateId = s.id " +
                "and u.id = p.headerId")
public class ProjectTo extends Project {
    private String header;
    private String level;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
