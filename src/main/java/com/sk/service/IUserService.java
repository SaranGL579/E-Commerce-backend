package com.sk.service;

import com.sk.dto.UserDto;
import com.sk.model.User;
import com.sk.request.CreateUserRequest;
import com.sk.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}