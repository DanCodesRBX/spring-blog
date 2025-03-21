package com.icode.blog.model;

import jakarta.persistence.*;

@Entity
public class BlogPost {
    // list of users who liked the post

    // Getters and setters...
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;

    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // owner of the post

    int likes;

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter and Setter for likedByUsers
    public int getLikes() {
        return likes;
    }

    public void setLikedByUsers(int likes) {
        this.likes = likes;
    }

}
