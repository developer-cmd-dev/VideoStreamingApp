package com.example.Amazon_backend.Entity;


import com.example.Amazon_backend.DTO.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private UserAddressEntity userAddress;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_FK", referencedColumnName = "id")
    private List<Order> orders = new ArrayList<>();


    public UserDTO toDTO(){
        return new UserDTO(this);
    }


}
