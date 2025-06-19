package com.example.Amazon_backend.DTO;

import com.example.Amazon_backend.Entity.Order;
import com.example.Amazon_backend.Entity.UserAddressEntity;
import com.example.Amazon_backend.Entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class UserDTO {
    private  String username;

    private String email;

    private String userAddress;

    private List<Order> orders = new ArrayList<>();

    public UserDTO(UserEntity userEntity) {
        this.username = userEntity.getUsername();
        this.email = userEntity.getEmail();
        this.userAddress = userEntity.getUserAddress()!=null? userEntity.getUserAddress().getCity():null;
        this.orders = userEntity.getOrders();
    }
}
