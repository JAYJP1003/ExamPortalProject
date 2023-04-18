package com.exam.Service.Implementation;

import com.exam.Entity.User;
import com.exam.Entity.UserRole;
import com.exam.Repository.RoleRepository;
import com.exam.Repository.UserRepository;
import com.exam.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepository.findByUserName(user.getUserName());
        if (local != null){
            System.out.println("Username is taken");
            throw new Exception("Username already present");
        }

        return null;
    }
}
