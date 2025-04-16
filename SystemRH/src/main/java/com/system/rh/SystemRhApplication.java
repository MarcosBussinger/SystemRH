package com.system.rh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.system.rh.SystemRH")
public class SystemRhApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemRhApplication.class, args);
	}
	
}
