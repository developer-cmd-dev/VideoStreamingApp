package com.example.Amazon_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.net.URI;

@Entity
@Table(name = "VIDEOS",schema = "VIDEOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Videos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoId;

    private String title;

    private String description;

    private String contentType;
    private URI filePath;


}
