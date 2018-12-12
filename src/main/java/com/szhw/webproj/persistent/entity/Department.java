package com.szhw.webproj.persistent.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author HJF
 * @date 2018/12/11 13:58
 */
@Entity
public class Department {
    private Integer id;
    private String depName;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dep_name")
    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                Objects.equals(depName, that.depName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, depName);
    }
}
