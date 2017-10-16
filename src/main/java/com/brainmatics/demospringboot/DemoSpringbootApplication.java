package com.brainmatics.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoSpringbootApplication {
	
	@RequestMapping("/")
	public String welcome(){
		return "welcome to springboot";
	}
	
	@RequestMapping("/halo")
	public String halo(String name){
		return "Halo "+ name;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
	}
}
