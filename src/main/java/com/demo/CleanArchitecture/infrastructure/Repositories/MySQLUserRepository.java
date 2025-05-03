package com.demo.CleanArchitecture.infrastructure.Repositories;

import com.demo.CleanArchitecture.domain.entities.User;
import com.demo.CleanArchitecture.domain.repositories.UserRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MySQLUserRepository implements UserRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/clean_architecture"; // Database URL
    private static final String USER = "root"; // Database username: vi du "UserDatabase"
    private static final String PASSWORD = "password"; // Database password "abYxz123"

    @Override
    public List<User> findAll() {
        // Write logic to find all users from MySQL database
        return new ArrayList<>();
    }

    @Override
    public User findById(int id) {
        // Write logic to find user by ID from MySQL database
        return null;
    }

    @Override
    public void save(User user) {
        // Write logic to save user to MySQL database
    }
}