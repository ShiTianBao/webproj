package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Project:操作的实体类的类名 String:该实体类主键的类型
 */
public interface ProjectRepository extends JpaRepository<Project, Integer> {
//    @Query("select Project from Project p where p.headerId=:userId or p.id in (" +
//            "select projectId from Members where userId=:userId)")
//    List<Project> listUserProject(@Param("userId") Integer userId);
}
