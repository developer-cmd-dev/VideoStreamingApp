package com.example.Amazon_backend.Service;

import com.example.Amazon_backend.Entity.Order;
import com.example.Amazon_backend.Entity.UserEntity;
import com.example.Amazon_backend.Exception.CustomException;
import com.example.Amazon_backend.Repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserEntity saveUser(UserEntity user) {
        return repository.save(user);
    }

    public Optional<UserEntity> getUserById(Long id) {
        log.info(id.toString());
        return repository.findById(id);
    }


    public UserEntity createOrder(Long id, List<Order> orders) {
        UserEntity user = repository.findById(id).orElse(null);
        if (user != null) {
            for (Order order : orders) {
                user.getOrders().add(order);
                user.setOrders(user.getOrders());
            }
            return repository.save(user);
        }else{
            throw new CustomException("User not found", HttpStatus.NOT_FOUND);

        }


    }


















}