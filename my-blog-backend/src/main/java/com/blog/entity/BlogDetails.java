package com.blog.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class BlogDetails {

    @Id
    private String id;
    private String auther;
    private String title;
    private String topic;
    private String email;
    private String blogText;
    private List<String> hashTags;
    @Transient
    private List<Review> review;

}
