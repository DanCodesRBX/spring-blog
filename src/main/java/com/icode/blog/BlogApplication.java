package com.icode.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
