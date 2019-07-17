package com.ghost.hcls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ghost.hcls.sys.*","com.ghost.hcls.core.config"})
public class HclsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HclsApplication.class, args);
	}

}
