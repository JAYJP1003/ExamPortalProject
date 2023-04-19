package com.exam.Controller;

import com.exam.Entity.Role;
import com.exam.Entity.User;
import com.exam.Entity.UserRole;
import com.exam.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        UserRole userRole = new UserRole(user, new Role(45L, "NORMAL"));
        Set<UserRole> userRoleSet = new HashSet<>();
        userRoleSet.add(userRole);

        this.userService.createUser(user, userRoleSet);
        return user;
    }

}
