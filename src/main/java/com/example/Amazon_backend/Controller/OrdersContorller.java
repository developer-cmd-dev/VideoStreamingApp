package com.example.Amazon_backend.Controller;

import com.example.Amazon_backend.DTO.UserDTO;
import com.example.Amazon_backend.Entity.Order;
import com.example.Amazon_backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrdersContorller {

    @Autowired
    private UserService userService;


    @PutMapping("/orders/{id}")
    public ResponseEntity<UserDTO> createOrders(@PathVariable Long id, @RequestBody List<Order> orders){
        UserDTO response = userService.createOrder(id,orders).toDTO();
        return ResponseEntity.ok(response);
    }


}
