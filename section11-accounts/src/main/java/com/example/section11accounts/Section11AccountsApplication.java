package com.example.section11accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableJpaRepositories
@RefreshScope
public class Section11AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section11AccountsApplication.class, args);
	}

}
