package com.jbeans.corejava8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EnableJpaRepositories("com.jbeans.corejava8.repository")
@ComponentScan("com.jbeans.corejava8")
public class Corejava8Application {

	public static void main(String[] args) {
		SpringApplication.run(Corejava8Application.class, args);
	}

}
