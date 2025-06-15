package com.example.Amazon_backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.net.URI;

@Entity
@Table(name = "videos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Videos {

    @Id
    private String videoId;

    private String title;

    private String description;

    private String contentType;
    private URI filePath;


}
