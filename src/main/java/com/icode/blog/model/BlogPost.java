package com.icode.blog.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // owner of the post

    @ManyToMany(mappedBy = "likedPosts")
    private List<User> likedByUsers; // list of users who liked the post

    // Getters and setters...
}
