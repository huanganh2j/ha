package com.huangan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringbootmybitesApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootmybitesApplication.class, args);
	}
}
