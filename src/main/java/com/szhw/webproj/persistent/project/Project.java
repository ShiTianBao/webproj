package com.szhw.webproj.persistent.project;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "declaration")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    /*
    申报级别（SC1：校级一类，SC2：校级二类）
     */
    @Column(length = 5)
    private String level;
    /*
    项目名称
     */
    @Column
    private String name;
    /*
    项目负责人(ID)
     */
    @Column
    private String header;
    /*
    负责人手机号码
     */
    @Column
    private String phoneNum;
    /*
    负责人邮箱
     */
    @Column
    private String email;
    /*
    所属专业
     */
    @Column
    private String specialty;
    /*
    项目成员
     */
    @Column
    private List<String> members;
    /*
    立项承诺
     */
    @Column
    private String promise;
    /*
    项目状态（0：未提交的新项目 1：等待初审 2：初审未通过 3：立项评审中 4：立项评审完成）
     */
    @Column(length = 2)
    private String state;
    /*
    项目得分
     */
    @Column
    private Integer score;
    /*
    专家评语
     */
    @Column
    private String comment;
    /*
    是否立项("0":待定 "1":立项 "2":不立项)
     */
    @Column(length = 1)
    private String approval;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }
}
