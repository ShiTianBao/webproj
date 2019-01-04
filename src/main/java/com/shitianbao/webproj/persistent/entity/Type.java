package com.shitianbao.webproj.persistent.entity;


import javax.persistence.*;

@Entity //告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "type") //@Table来指定和哪个数据表对应;如果省略默认表名就是user；
public class Type {

    private int id;
    private String projectType;
    private String startTime;
    private String endTime;
    private String midTime;
    private String finalTime;
    private String firstRule;
    private String midRule;
    private String finalRule;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "project_type")
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    @Basic
    @Column(name = "start_time")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "mid_time")
    public String getMidTime() {
        return midTime;
    }

    public void setMidTime(String midTime) {
        this.midTime = midTime;
    }

    @Basic
    @Column(name = "final_time")
    public String getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }

    @Basic
    @Column(name = "first_rule")
    public String getFirstRule() {
        return firstRule;
    }

    public void setFirstRule(String firstRule) {
        this.firstRule = firstRule;
    }

    @Basic
    @Column(name = "mid_rule")
    public String getMidRule() {
        return midRule;
    }

    public void setMidRule(String midRule) {
        this.midRule = midRule;
    }

    @Basic
    @Column(name = "final_rule")
    public String getFinalRule() {
        return finalRule;
    }

    public void setFinalRule(String finalRule) {
        this.finalRule = finalRule;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", projectType='" + projectType + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", midTime='" + midTime + '\'' +
                ", finalTime='" + finalTime + '\'' +
                ", firstRule='" + firstRule + '\'' +
                ", midRule='" + midRule + '\'' +
                ", finalRule='" + finalRule + '\'' +
                '}';
    }
}
