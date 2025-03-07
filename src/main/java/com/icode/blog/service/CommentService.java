package com.icode.blog.service;

import com.icode.blog.model.Comment;
import com.icode.blog.repository.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment findById(Integer id) {
        return commentRepository.findById(id).orElse(null);
    }

    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    public void deleteById(Integer id) {
        commentRepository.deleteById(id);
    }
}
