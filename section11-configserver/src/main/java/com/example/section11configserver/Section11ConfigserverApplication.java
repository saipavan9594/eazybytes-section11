package com.example.section11configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Section11ConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section11ConfigserverApplication.class, args);
	}

}
