package com.example.Amazon_backend.DTO;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FindUserDto {
    private long totalPages;
    private List<UserDTO> searchResponse;
}
