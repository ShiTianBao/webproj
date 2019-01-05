package com.shitianbao.webproj.persistent.repository;

import com.shitianbao.webproj.persistent.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface TypeRepository extends JpaRepository<Type,Integer> {

    //中期检查规则
    @Transactional
    @Modifying
    @Query(value = "update type t set t.mid_time= :midTime, t.mid_rule = :midRule where t.id= :id", nativeQuery = true)
    public void updateMidRuleAndMidTime(@Param("midTime") String midTime, @Param("midRule") String midRule, @Param("id")int id);

    //结题验收规则
    @Transactional
    @Modifying
    @Query(value = "update type t set t.final_time= :finalTime, t.final_rule = :finalRule where t.id= :id", nativeQuery = true)
    public void updateFinalRuleAndFinalTime(@Param("finalTime") String finalTime, @Param("finalRule") String finalRule, @Param("id")int id);
}
