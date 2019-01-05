package com.shitianbao.webproj.persistent.repository;

import com.shitianbao.webproj.persistent.entity.Proj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProjRepository extends JpaRepository<Proj,Integer> {

    //修改proj的state的状态
    @Transactional
    @Modifying
    @Query(value = "update proj p set p.state= :state where p.id= :id", nativeQuery = true)
    public void updateProjState(@Param("state") String state, @Param("id")int id);

    //根据状态查找
    @Transactional
    @Modifying
    @Query(value = "select * from proj p where p.state = :state", nativeQuery = true)
    public List<Proj> findAllByState(@Param("state") String state);

    //修改proj的中期驳回原因
    @Transactional
    @Modifying
    @Query(value = "update proj p set p.midReason= :midReason where p.id= :id", nativeQuery = true)
    public void updateProjMidReason(@Param("midReason") String midReason, @Param("id")int id);

    //修改proj的结题驳回原因
    @Transactional
    @Modifying
    @Query(value = "update proj p set p.finalReason= :finalReason where p.id= :id", nativeQuery = true)
    public void updateProjFinalReason(@Param("finalReason") String finalReason, @Param("id")int id);

}
