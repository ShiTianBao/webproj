package com.szhw.webproj.persistent.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author HJF
 * @date 2018/12/15 10:59
 */
@Entity
public class Specialty {
    private Integer id;
    private String specialty;

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
    @Column(name = "specialty")
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialty specialty1 = (Specialty) o;
        return Objects.equals(id, specialty1.id) &&
                Objects.equals(specialty, specialty1.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, specialty);
    }
}
