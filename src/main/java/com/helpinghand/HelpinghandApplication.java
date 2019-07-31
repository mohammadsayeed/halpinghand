package com.helpinghand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com")
@EnableJpaRepositories({"com.helpinghand.repository"})
@EntityScan("com.helpinghand.entity")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HelpinghandApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpinghandApplication.class, args);
	}

}
