package com.jtp.jutopia.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class JutopiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JutopiaApplication.class, args);
	}

}
