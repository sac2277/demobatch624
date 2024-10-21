package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demobatch624Application {
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to session";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demobatch624Application.class, args);
	}

}
