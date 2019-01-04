package com.shitianbao.webproj.persistent.repository;

import com.shitianbao.webproj.persistent.entity.Proj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ProjRepository extends JpaRepository<Proj,Integer> {

    //修改proj的state的状态
    @Transactional
    @Modifying
    @Query(value = "update proj p set p.state= :state where p.id= :id", nativeQuery = true)
    public void updateProjState(@Param("state") String state, @Param("id")int id);

}
