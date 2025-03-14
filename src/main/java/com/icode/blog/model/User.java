package com.icode.blog.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password; // added password field

    private String description;

    @CreationTimestamp
    private Instant creationTime;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BlogPost> postsMade; // list of posts made by the user

    @ManyToMany
    @JoinTable(name = "user_liked_posts", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<BlogPost> likedPosts; // list of posts liked by the user

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BlogPost> getPostsMade() {
        return postsMade;
    }

    public void setPostsMade(List<BlogPost> postsMade) {
        this.postsMade = postsMade;
    }

    public List<BlogPost> getLikedPosts() {
        return likedPosts;
    }

    public void setLikedPosts(List<BlogPost> likedPosts) {
        this.likedPosts = likedPosts;
    }
}
