package com.szhw.webproj.controller;


import com.szhw.webproj.common.CommonResult;
import com.szhw.webproj.persistent.entity.Department;
import com.szhw.webproj.persistent.entity.Role;
import com.szhw.webproj.persistent.entity.User;
import com.szhw.webproj.persistent.entity.to.UserTo;
import com.szhw.webproj.persistent.repository.DepartmentRepository;
import com.szhw.webproj.persistent.repository.RoleRepository;
import com.szhw.webproj.persistent.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserRepository userRepository;
    @Resource
    RoleRepository roleRepository;
    @Resource
    DepartmentRepository departmentRepository;

    @GetMapping("/list")
    public CommonResult userList() {
        CommonResult result = new CommonResult();
        List<User> userList = userRepository.findAll();
        Role tmpRole = new Role();
        tmpRole.setRoleName("无");
        Department tmpDepartment = new Department();
        tmpDepartment.setDepName("无");
        List<UserTo> userToList = userList.stream()
                .map(user -> {
                    Role role = new Role();
                    Department department = new Department();
                    UserTo userTo = new UserTo();
                    BeanUtils.copyProperties(user, userTo);
                    //设置role
                    role.setId(user.getRoleId());
                    Optional<Role> roleOptional = roleRepository.findOne(Example.of(role));
                    userTo.setRole(roleOptional.orElse(tmpRole).getRoleName());
                    //设置dep
                    department.setId(user.getDepartmentId());
                    Optional<Department> departmentOptional = departmentRepository.findOne(Example.of(department));
                    userTo.setDepartment(departmentOptional.orElse(tmpDepartment).getDepName());
                    return userTo;
                }).collect(Collectors.toList());
        result.setData(userToList);
        return result;
    }

    @PostMapping("/add")
    public CommonResult addUser(User user) {
        CommonResult result = new CommonResult();
        userRepository.save(user);
        return result;
    }

    @GetMapping("/update")
    public CommonResult updateUser(User user) {
        CommonResult result = new CommonResult();
        userRepository.saveAndFlush(user);
        return result;
    }
}
