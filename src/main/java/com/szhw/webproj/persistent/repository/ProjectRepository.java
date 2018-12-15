package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.Project;
import com.szhw.webproj.persistent.entity.to.ProjectTo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Project:操作的实体类的类名 String:该实体类主键的类型
 */
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
