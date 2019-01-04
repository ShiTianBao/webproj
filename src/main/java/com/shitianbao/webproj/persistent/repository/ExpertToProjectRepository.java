package com.shitianbao.webproj.persistent.repository;

import com.shitianbao.webproj.persistent.entity.ExpertToProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ExpertToProjectRepository extends JpaRepository<ExpertToProject,Integer> {

    //打分和评语
    @Transactional
    @Modifying
    @Query(value = "update expert_to_project p set p.score= :score, p.comment = :comment where p.project_id= :id", nativeQuery = true)
    public void updateScoreAndComment(@Param("score") String score, @Param("comment") String comment, @Param("id")int id);
}
