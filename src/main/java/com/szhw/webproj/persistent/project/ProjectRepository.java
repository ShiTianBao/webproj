package com.szhw.webproj.persistent.project;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project:操作的实体类的类名 String:该实体类主键的类型
 */
public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
