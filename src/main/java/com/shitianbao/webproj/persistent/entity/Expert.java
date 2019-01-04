package com.shitianbao.webproj.persistent.entity;

import javax.persistence.*;

@Entity
@Table(name = "expert")
public class Expert {

    private int id;
    private String name;
    private String major;
    private String department;
    private String position;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Expert{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
