package com.hikerzapi.hikerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@EnableWebMvc
public class HikerzApplication {

	public static void main(String[] args) {
		SpringApplication.run(HikerzApplication.class, args);
	}


}