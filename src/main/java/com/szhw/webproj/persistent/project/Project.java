package com.szhw.webproj.persistent.project;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "declaration")
public class Project  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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
    private String phone;
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
    项目成员最多5个
     */
    @Column
    private String member1;
    @Column
    private String member2;
    @Column
    private String member3;
    @Column
    private String member4;
    @Column
    private String member5;
    /*
    立项承诺
     */
    @Column
    private String promise;
    /*
    项目状态（0：未提交的新项目 1：等待初审 2：初审未通过 3：立项评审中 4：立项评审完成 ）
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
    /*
    中期时间检查期限
     */
    @Column
    private Date midCheckDate;
    /*
    中期检查说明
     */
    @Column
    private String midCheckInfo;
    /*
    驳回原因说明
     */
    @Column
    private String rejectInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public String getMember3() {
        return member3;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

    public String getMember4() {
        return member4;
    }

    public void setMember4(String member4) {
        this.member4 = member4;
    }

    public String getMember5() {
        return member5;
    }

    public void setMember5(String member5) {
        this.member5 = member5;
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

    public Date getMidCheckDate() {
        return midCheckDate;
    }

    public void setMidCheckDate(Date midCheckDate) {
        this.midCheckDate = midCheckDate;
    }

    public String getMidCheckInfo() {
        return midCheckInfo;
    }

    public void setMidCheckInfo(String midCheckInfo) {
        this.midCheckInfo = midCheckInfo;
    }

    public String getRejectInfo() {
        return rejectInfo;
    }

    public void setRejectInfo(String rejectInfo) {
        this.rejectInfo = rejectInfo;
    }
}
