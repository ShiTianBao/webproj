package com.szhw.webproj.persistent.entity.to;

import com.szhw.webproj.persistent.entity.User;

/**
 * @author HJF
 * @date 2018/12/6 14:59
 */
public class UserTo extends User {
    private String department;
    private String role;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
