package com.chenxing.demoshardingjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.chenxing.demoshardingjdbc", "com.chenxing.common" })
public class MultidatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultidatasourceApplication.class, args);
	}
}
