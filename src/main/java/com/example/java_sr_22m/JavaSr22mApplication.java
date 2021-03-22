package com.example.java_sr_22m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JavaSr22mApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSr22mApplication.class, args);
	}

}
