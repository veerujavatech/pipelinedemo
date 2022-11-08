package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static String  welcomeMessage="welcome to aws application ... commit test one two 2nd";
	@GetMapping("/")
	public String getMessage() {
		return welcomeMessage;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	public void gitExamples() {
		// 1 commit 
		//2  commit
		// 3 commit 
		//4

	}

}
