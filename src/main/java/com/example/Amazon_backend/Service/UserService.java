package com.example.Amazon_backend.Service;

import com.example.Amazon_backend.Entity.UserEntity;
import com.example.Amazon_backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserEntity saveUser(UserEntity user){
        return repository.save(user);
    }

}
