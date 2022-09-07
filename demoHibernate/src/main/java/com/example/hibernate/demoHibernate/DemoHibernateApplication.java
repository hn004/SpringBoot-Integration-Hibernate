package com.example.hibernate.demoHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHibernateApplication.class, args);
	}

}
