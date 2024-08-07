package com.spring.implementation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.implementation.mapper")
public class SpringbootWithMyBatisCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithMyBatisCrudApplication.class, args);
	}

}
