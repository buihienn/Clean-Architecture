package com.demo.CleanArchitecture.app.services;

import com.demo.CleanArchitecture.domain.entities.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void createUser(User user);
}
