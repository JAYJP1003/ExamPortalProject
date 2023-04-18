package com.exam.Service;

import com.exam.Entity.User;
import com.exam.Entity.UserRole;

import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
