package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {

	private Connection connection;

	public Dbconnection(String dbURL, String userId, String pwd) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		this.connection = DriverManager.getConnection(dbURL, userId, pwd);
	}

	public Connection getConnection() {
		return this.connection;
	}

	public void closeConnection() throws SQLException {
		if (this.connection != null) {
			this.connection.close();
		}
	}

}
