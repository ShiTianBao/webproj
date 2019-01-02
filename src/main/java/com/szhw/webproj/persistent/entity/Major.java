package com.szhw.webproj.persistent.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author HJF
 * @date 2018/12/15 10:59
 */
@Entity
public class Major {
    private Integer id;
    private String major;

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
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String specialty) {
        this.major = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Major major1 = (Major) o;
        return Objects.equals(id, major1.id) &&
                Objects.equals(major, major1.major);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, major);
    }
}
