package com.szhw.webproj.persistent.menu;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author HJF
 * @date 2018/11/23 18:50
 */
@Entity
public class Menu {
    private int id;
    private int fatherId;
    private int index;
    private String name;
    private String url;
    private String icon;

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
    @Column(name = "father_id")
    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }

    @Basic
    @Column(name = "index")
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return id == menu.id &&
                fatherId == menu.fatherId &&
                index == menu.index &&
                Objects.equals(name, menu.name) &&
                Objects.equals(url, menu.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fatherId, index, name, url);
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
