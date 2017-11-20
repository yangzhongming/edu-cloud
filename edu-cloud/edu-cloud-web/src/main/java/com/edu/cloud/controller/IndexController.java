package com.edu.cloud.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IndexController {
	@RequestMapping("/index")
	String index() {
		return "Hello cloud exam。。。";
	}
  
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}

}
