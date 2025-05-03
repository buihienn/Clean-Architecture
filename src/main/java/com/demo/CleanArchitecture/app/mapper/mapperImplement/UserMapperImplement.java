package com.demo.CleanArchitecture.app.mapper.mapperImplement;

import org.springframework.stereotype.Component;

import com.demo.CleanArchitecture.api.dto.UserDTO;
import com.demo.CleanArchitecture.domain.entities.User;
import com.demo.CleanArchitecture.app.mapper.UserMapper;

@Component
public class UserMapperImplement implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getEmail());
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}