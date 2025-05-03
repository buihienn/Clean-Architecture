package com.demo.CleanArchitecture.domain.repositories;

import com.demo.CleanArchitecture.domain.entities.User;
import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findById(int id);
    void save(User user);
}