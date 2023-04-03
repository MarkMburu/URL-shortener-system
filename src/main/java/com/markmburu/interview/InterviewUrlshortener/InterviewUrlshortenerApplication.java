package com.markmburu.interview.InterviewUrlshortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.markmburu.interview.InterviewUrlshortener")
@SpringBootApplication
public class InterviewUrlshortenerApplication {

	public static void main(String[] args) {

		SpringApplication.run(InterviewUrlshortenerApplication.class, args);
	}

}
