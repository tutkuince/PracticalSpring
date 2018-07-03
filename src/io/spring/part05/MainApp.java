package io.spring.part05;

import java.sql.Connection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DBSingleton dbSingleton = context.getBean("dbSingleton", DBSingleton.class);
		Connection conn = dbSingleton.getConnection();
		
		if(conn != null)
			System.out.println("Connection is not null");
		else
			System.out.println("Connection is null");
		
		context.close();
	}
}
