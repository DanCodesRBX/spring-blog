package com.icode.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icode.blog.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
