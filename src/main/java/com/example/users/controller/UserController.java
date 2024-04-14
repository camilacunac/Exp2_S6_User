package com.example.users.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.users.Response;
import com.example.users.dto.LoginDto;
import com.example.users.dto.UpdateUserRoleDTO;
import com.example.users.model.User;
import com.example.users.service.UserService;

import jakarta.websocket.server.PathParam;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/register", produces = "application/json")
    public ResponseEntity<Response> registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping(value = "/login", produces = "application/json")
    public ResponseEntity<Response> loginUser(@RequestBody LoginDto dataLogin) {
        return userService.login(dataLogin);
    }

    @PutMapping(value = "/user/{idUser}", produces = "application/json")
    public ResponseEntity<Response> loginUser(@PathVariable Long idUser, @RequestBody UpdateUserRoleDTO role) {
        return userService.updateUserRole(idUser, role);
    }

    @DeleteMapping(value = "/user/delete/{idUser}", produces = "application/json")
    public ResponseEntity<Response> loginUser(@PathVariable Long idUser) {
        return userService.deleteUserById(idUser);
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
