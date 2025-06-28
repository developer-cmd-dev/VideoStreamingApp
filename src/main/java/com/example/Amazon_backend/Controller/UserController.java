package com.example.Amazon_backend.Controller;

import com.example.Amazon_backend.DTO.FindUserDto;
import com.example.Amazon_backend.DTO.UserDTO;
import com.example.Amazon_backend.Entity.UserEntity;
import com.example.Amazon_backend.Service.UserService;
import org.hibernate.annotations.processing.Find;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;




    @PostMapping("/signup")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserEntity data){
        UserDTO response = userService.saveUser(data);
        return ResponseEntity.ok(response);
    }





}
