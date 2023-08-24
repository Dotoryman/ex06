package com.boot.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.boot.app.**.mapper" )
public class Ex06Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex06Application.class, args);
	}

}
