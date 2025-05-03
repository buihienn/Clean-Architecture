package com.demo.CleanArchitecture.app.mapper;

import com.demo.CleanArchitecture.domain.entities.User;
import com.demo.CleanArchitecture.api.dto.UserDTO;

public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
