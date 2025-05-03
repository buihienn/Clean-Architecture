package com.demo.CleanArchitecture.app.services.servicesImplement;

import com.demo.CleanArchitecture.app.services.UserService;
import com.demo.CleanArchitecture.domain.entities.User;
import com.demo.CleanArchitecture.domain.repositories.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImplement implements UserService {
    private final UserRepository userRepository;

    public UserServiceImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
