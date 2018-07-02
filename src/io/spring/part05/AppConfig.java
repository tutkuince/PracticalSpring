package io.spring.part05;

import java.sql.Connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public DBSingleton dbSingleton() {
		return DBSingleton.getInstance();
	}

	@Bean
	public Connection connection() {
		return dbSingleton().getConnection();
	}
}
