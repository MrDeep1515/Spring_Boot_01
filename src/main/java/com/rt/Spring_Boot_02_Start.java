package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value="classpath:demo.properties")
@SpringBootApplication
public class Spring_Boot_02_Start {

	public static void main(String[] args) {
		SpringApplication.run(Spring_Boot_02_Start.class, args);
	}

}
