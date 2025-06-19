package com.example.Amazon_backend.Service;

import com.example.Amazon_backend.Entity.UserEntity;
import com.example.Amazon_backend.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserEntity saveUser(UserEntity user){
        return repository.save(user);
    }

    public Optional<UserEntity> getUserById(Long id){
        log.info(id.toString());
      return repository.findById(id);
    }

}
