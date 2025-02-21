package com.icode.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icode.blog.model.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {

}
