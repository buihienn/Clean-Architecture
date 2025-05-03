package com.demo.CleanArchitecture.infrastructure.Repositories;

import com.demo.CleanArchitecture.domain.entities.User;
import com.demo.CleanArchitecture.domain.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;


public class InMemoryUserRepository implements UserRepository {
    private final List<User> users = new ArrayList<>();

    public InMemoryUserRepository() {
        users.add(new User(1, "Bui Hien", "buihien@gmail.com"));
        users.add(new User(2, "Main Win", "mainWin@github.com"));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    public void save(User user) {
        users.add(user);
    }
}
