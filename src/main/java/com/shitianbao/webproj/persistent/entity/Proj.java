package com.shitianbao.webproj.persistent.entity;

import javax.persistence.*;

@Entity
@Table(name = "proj")
public class Proj {

    private int id;
    private String projectType;
    private String projectName;
    private String level;
    private String header;
    private String phone;
    private String email;
    private String major;
    private int numberCount;
    private String number1;
    private String number2;
    private String number3;
    private String number4;
    private String commit;
    private String state;
    private String fileState;
    private String fileUrl;

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
    @Column(name = "project_type")
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
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
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "header")
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
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
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "number_count")
    public int getNumberCount() {
        return numberCount;
    }

    public void setNumberCount(int numberCount) {
        this.numberCount = numberCount;
    }

    @Basic
    @Column(name = "number1")
    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    @Basic
    @Column(name = "number2")
    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    @Basic
    @Column(name = "number3")
    public String getNumber3() {
        return number3;
    }

    public void setNumber3(String number3) {
        this.number3 = number3;
    }

    @Basic
    @Column(name = "number4")
    public String getNumber4() {
        return number4;
    }

    public void setNumber4(String number4) {
        this.number4 = number4;
    }

    @Basic
    @Column(name = "commit")
    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "file_state")
    public String getFileState() {
        return fileState;
    }

    public void setFileState(String fileState) {
        this.fileState = fileState;
    }

    @Basic
    @Column(name = "file_url")
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "Proj{" +
                "id=" + id +
                ", projectType='" + projectType + '\'' +
                ", projectName='" + projectName + '\'' +
                ", level='" + level + '\'' +
                ", header='" + header + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", major='" + major + '\'' +
                ", numberCount=" + numberCount +
                ", number1='" + number1 + '\'' +
                ", number2='" + number2 + '\'' +
                ", number3='" + number3 + '\'' +
                ", number4='" + number4 + '\'' +
                ", commit='" + commit + '\'' +
                ", state='" + state + '\'' +
                ", fileState='" + fileState + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                '}';
    }
}
