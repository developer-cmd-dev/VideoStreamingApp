package com.example.Amazon_backend.Controller;

import com.example.Amazon_backend.Entity.UserEntity;
import com.example.Amazon_backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
