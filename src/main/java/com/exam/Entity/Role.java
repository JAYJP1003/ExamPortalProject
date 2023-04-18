package com.exam.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

//    Entity Variables
    @Id
    private Long roleId;
    private String roleName;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "role")
    private Set<UserRole> userRoles = new HashSet<>();

//    No parameter constructor
    public Role(){

    }

//  Parameterized Constructor
    public Role(Long roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

//    Getters and Setters


    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
