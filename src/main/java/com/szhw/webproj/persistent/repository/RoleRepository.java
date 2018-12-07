package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HJF
 * @date 2018/12/6 15:03
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
