package com.ecom.ecom_application.service;

import com.ecom.ecom_application.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUser();

    UserDto createUser(UserDto userDto);
    }
