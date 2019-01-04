package com.shitianbao.webproj.persistent.repository;

import com.shitianbao.webproj.persistent.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<Expert,Integer> {
}
