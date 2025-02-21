package com.icode.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.icode.blog.BlogPost;

public class BlogPostController {
    @GetMapping
    public String getAllBlogBlogPosts(Model model) {
        List<BlogPost> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "post/list";
    }

    @GetMapping("/view/{id}")
    public String viewBlogPostById(@PathVariable Integer id, Model model) {
        BlogPost post = postService.findById(id);
        if (post == null) 
            return "redirect:/post";

        model.addAttribute("posts", post);
        return "post/view";
    }
    
    @GetMapping("/add")
    public String addPostForm(Model model) {
        model.addAttribute("post", new BlogPost());
        return "post/add";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute BlogPost post) {
        postService.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/edit/{id}")
    public String editBlogPostForm(@PathVariable Integer id, Model model) {
        BlogPost post = postService.findById(id);
        if (post == null) 
            return "redirect:/posts";

        model.addAttribute("blogpost", post);
        return "post/edit";
    }

    @PostMapping("/edit/{id}")
    public String editPost(@PathVariable Integer id, @ModelAttribute BlogPost post) {
        post.setBlogPostById(id);
        postService.save(post);
        return "redirect:/blogpost/view/" + id;
    }

    @GetMapping("/delete/{id}")
    public String deleteBlogPostForm(@PathVariable Integer id, Model model) {
        BlogPost post = postService.findById(id);
        if (post == null) {
            return "redirect:/blogposts";
        }
        model.addAttribute("blogpost", post);
        return "blogpost/delete";
    }
    @PostMapping("/delete/{id}")
    public String deleteBlogPost(@PathVariable Integer id) {
        blogpostService.deleteById(id);
        return "redirect:/blogposts";
        
    }
      
}
