package com.example.Amazon_backend.Service;

import com.example.Amazon_backend.DTO.FindUserDto;
import com.example.Amazon_backend.DTO.UserDTO;
import com.example.Amazon_backend.Entity.Order;
import com.example.Amazon_backend.Entity.UserEntity;
import com.example.Amazon_backend.Exception.CustomException;
import com.example.Amazon_backend.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public UserDTO saveUser(UserEntity data){
        return repository.save(data).toDTO();
    }



}