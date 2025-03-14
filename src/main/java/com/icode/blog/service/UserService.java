package com.icode.blog.service;

import com.icode.blog.model.User;
import com.icode.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public void save(User blogPost) {
        userRepository.save(blogPost);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
