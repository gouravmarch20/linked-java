package com.example.postService.dto;


import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PostDto  {

    private Long id;
    private String Content;

    private Long userId;
    private  LocalDateTime createdAt ;


}
