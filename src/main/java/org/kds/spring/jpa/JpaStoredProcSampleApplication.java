package org.kds.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class , HibernateJpaAutoConfiguration.class})
public class JpaStoredProcSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaStoredProcSampleApplication.class, args);
	}
}
