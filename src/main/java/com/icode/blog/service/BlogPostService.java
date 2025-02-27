package com.icode.blog.service;

import com.icode.blog.model.BlogPost;
import com.icode.blog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    public BlogPost findById(Integer id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    public void save(BlogPost blogPost) {
        blogPostRepository.save(blogPost);
    }

    public void deleteById(Integer id) {
        blogPostRepository.deleteById(id);
    }
}
