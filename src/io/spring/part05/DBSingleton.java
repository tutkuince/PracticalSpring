package io.spring.part05;

import java.sql.Connection;

public class DBSingleton {
	private static final DBSingleton instance = new DBSingleton();
	
	private DBSingleton() {
		// private constructor
	}
	
	// Factory Method
	public static final DBSingleton getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		return null;
	}
}
