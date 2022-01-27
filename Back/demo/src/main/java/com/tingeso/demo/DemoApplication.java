package com.tingeso.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.*;
//import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	/*
	 * @Bean
	 * public WebMvcConfigurer corsConfigurer() {
	 * return new WebMvcConfigurer() {
	 * 
	 * @Override
	 * public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**").allowedOrigins("http://localhost:3000").
	 * allowedMethods("GET", "POST", "PUT");
	 * }
	 * };
	 * }
	 */
}