package com.szhw.webproj.persistent.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author HJF
 * @date 2018/12/14 18:50
 */
@Entity
public class Project {
    private Integer id;
    private String projectName;
    private Integer headerId;
    private String email;
    private String phone;
    private Integer levelId;
    private Integer stateId;
    private Integer specialtyId;
    private String promise;
    private Integer score;
    private String comment;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "project_name")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "header_id")
    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "level_id")
    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    @Basic
    @Column(name = "state_id")
    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "specialty_id")
    public Integer getSpecialty() {
        return specialtyId;
    }

    public void setSpecialty(Integer specialty) {
        this.specialtyId = specialty;
    }

    @Basic
    @Column(name = "promise")
    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    @Basic
    @Column(name = "score")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id.equals(project.id) &&
                Objects.equals(projectName, project.projectName) &&
                Objects.equals(headerId, project.headerId) &&
                Objects.equals(email, project.email) &&
                Objects.equals(phone, project.phone) &&
                Objects.equals(levelId, project.levelId) &&
                Objects.equals(stateId, project.stateId) &&
                Objects.equals(specialtyId, project.specialtyId) &&
                Objects.equals(promise, project.promise) &&
                Objects.equals(score, project.score) &&
                Objects.equals(comment, project.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectName, headerId, email, phone, levelId, stateId, specialtyId, promise, score, comment);
    }
}
