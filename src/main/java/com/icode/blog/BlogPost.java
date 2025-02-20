package com.icode.blog;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class BlogPost {
   // list of users who liked the post

    // Getters and setters...
    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    private Long id;      

    private String content;      

    @ManyToOne     
    @JoinColumn(name = "user_id")     
    private User user; // owner of the post      

    @OneToOne(mappedBy = "likedPosts")     
    int likedByUsers;

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Getter and Setter for user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getter and Setter for likedByUsers
    int getLikedByUsers() {
        return likedByUsers;
    }

    public void setLikedByUsers(int likedByUsers) {
        this.likedByUsers = likedByUsers;
    }
    
}
