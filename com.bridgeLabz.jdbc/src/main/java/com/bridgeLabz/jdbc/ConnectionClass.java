package com.bridgeLabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author - Sourabh Magdum
 * @Purpose - Connection class to establish connection
 *  Date - 05/11/2019
 */
public class ConnectionClass {

	public static Connection connectionToDB() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/Student";
		String username = "root";
		String password = "password";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

}
