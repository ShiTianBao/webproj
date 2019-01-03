package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HJF
 * @date 2019/1/3 15:14
 */
public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
}
