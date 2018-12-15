package com.szhw.webproj.persistent.repository;

import com.szhw.webproj.persistent.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HJF
 * @date 2018/12/15 13:48
 */
public interface LevelRepository extends JpaRepository<Level,Integer> {
}
