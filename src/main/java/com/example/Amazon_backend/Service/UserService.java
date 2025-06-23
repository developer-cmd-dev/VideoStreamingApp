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

    public List<UserEntity> saveUser(List<UserEntity> user) {
       List<UserEntity> response =  user.stream().map(x->{
           return repository.save(x);
        }).toList();
        return response;
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

    public FindUserDto getUserByName(String name, Pageable pageable){
        Page<UserEntity> response = repository.findUserEntityByUsernameStartsWith(name, pageable);
        List<UserDTO> userDTOS = response.getContent().stream().map(x->x.toDTO()).toList();
        FindUserDto dto = new FindUserDto();
        dto.setTotalPages(response.getTotalPages());
        dto.setSearchResponse(userDTOS);
        return dto;
    }


















}