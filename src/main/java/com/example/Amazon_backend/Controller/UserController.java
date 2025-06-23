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
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("signup")
    public ResponseEntity<List<UserEntity>> saveUser(@RequestBody List<UserEntity> data){
        List<UserEntity> response = userService.saveUser(data);
        return ResponseEntity.ok(response);
    }


    @GetMapping("get_user/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id){
        UserEntity response =userService.getUserById(id).orElse(null);
        assert response != null;
        return ResponseEntity.ok(response.toDTO());
    }


    @GetMapping("get_user_by_name/{name}")
    public ResponseEntity<FindUserDto> getUserByName(@PathVariable String name){
        Pageable pageRequest = PageRequest.of(0, 5);
       FindUserDto response = userService.getUserByName(name,pageRequest);

       return new ResponseEntity<>(response, HttpStatus.OK);


    }




}
