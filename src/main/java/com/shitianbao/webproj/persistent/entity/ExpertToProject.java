package com.shitianbao.webproj.persistent.entity;

import javax.persistence.*;

@Entity
@Table(name = "expert_to_project")
public class ExpertToProject {

    private int id;
    private int expertId;
    private int projectId;
    private String score;
    private String comment;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "expert_id")
    public int getExpertId() {
        return expertId;
    }

    public void setExpertId(int expertId) {
        this.expertId = expertId;
    }

    @Basic
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "score")
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ExpertToProject{" +
                "id=" + id +
                ", expertId=" + expertId +
                ", projectId=" + projectId +
                ", score='" + score + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
