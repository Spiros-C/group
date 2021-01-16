package com.group.project.services;

import java.util.List;
import com.group.project.entities.Users;

public interface IUsersService {
    
    Users findById(int userId);
    List<Users> findAllUsers();
    
    void saveUser(Users user);
    void updateUser(Users user);
    boolean booleanUpdate(Users user);
    void deleteUserByUserId(int userId);
    boolean booleanDeleteUserByUserId(int userId);
    
}
