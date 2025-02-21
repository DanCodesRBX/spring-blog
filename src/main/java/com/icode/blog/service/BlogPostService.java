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

    @Override
    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    @Override
    public BlogPost findById(Integer id) {
        return blogPostRepository.findById(id).orElse(null);
    }

    @Override
    public void save(BlogPost blogPost) {
        blogPostRepository.save(blogPost);
    }

    @Override
    public void deleteById(Integer id) {
        blogPostRepository.deleteById(id);
    }
    
}
