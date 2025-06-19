package com.example.Amazon_backend.Controller;

import com.example.Amazon_backend.DTO.UserDTO;
import com.example.Amazon_backend.Entity.UserEntity;
import com.example.Amazon_backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("signup")
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity data){
        UserEntity response = userService.saveUser(data);
        return ResponseEntity.ok(response);
    }


    @GetMapping("get_user/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id){
        UserEntity response =userService.getUserById(id).orElse(null);
        assert response != null;
        return ResponseEntity.ok(response.toDTO());
    }




}
