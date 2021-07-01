package com.frohwolf.springjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJavaApplication {

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJavaApplication.class, args);
	}

}
