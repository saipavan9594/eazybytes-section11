package com.example.section11cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class Section11CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section11CardsApplication.class, args);
	}

}
