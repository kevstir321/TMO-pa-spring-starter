package com.galvanize.tmo.paspringstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
@SpringBootApplication
//@ComponentScan("com.galvanize.tmo.paspringstarter.repository")

public class PaSpringStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaSpringStarterApplication.class, args);
	}

}
