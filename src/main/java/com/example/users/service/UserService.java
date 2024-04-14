package com.example.users.service;

import org.springframework.http.ResponseEntity;

import com.example.users.Response;
import com.example.users.dto.LoginDto;
import com.example.users.dto.UpdateUserRoleDTO;
import com.example.users.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    ResponseEntity<Response> registerUser(User user);

    ResponseEntity<Response> login(LoginDto dataLogin);

    ResponseEntity<Response> updateUserRole(Long idUser, UpdateUserRoleDTO role);

    ResponseEntity<Response> deleteUserById(long idUser);

}
