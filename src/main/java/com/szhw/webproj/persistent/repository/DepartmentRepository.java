package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HJF
 * @date 2018/12/6 15:02
 */
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
