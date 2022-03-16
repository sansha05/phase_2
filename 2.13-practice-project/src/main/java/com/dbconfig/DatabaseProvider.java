package com.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseProvider {
	
	static private Connection connection;
	static private String url = "jdbc:mysql://localhost:3306/sandeepdb";
	static private String username = "root";
	static private String password = "1234asdf";
	
		
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		
		return connection;
	}
		
		
		
	
	
	

}
