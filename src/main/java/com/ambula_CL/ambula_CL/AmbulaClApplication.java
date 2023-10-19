package com.ambula_CL.ambula_CL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AmbulaClApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbulaClApplication.class, args);
	}

}
