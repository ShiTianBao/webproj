package com.szhw.webproj.persistent.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 在数据库菜单bean基础上添加主菜单（添加 children来显示子菜单）
 * @author HJF
 * @date 2018/11/23 19:03
 */
public class MainMenu extends Menu implements Serializable {
    private List<Menu> children = new ArrayList<>(10);

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
