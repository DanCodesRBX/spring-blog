package com.icode.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icode.blog.model.User;
import com.icode.blog.service.UserService;



@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/add")
    public String addPostForm(Model model) {
        model.addAttribute("user", new User());
        return "user/add";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/user/" + user.getId();
    }
}


