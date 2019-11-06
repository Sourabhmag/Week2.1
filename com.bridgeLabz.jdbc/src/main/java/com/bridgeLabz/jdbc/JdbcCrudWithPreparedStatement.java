package com.bridgeLabz.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgeLabz.utility.Util;

/**
 * @author Sourabh Magdum
 * @Purpose - Login application using jdbc prepared Statement
 * Date - 05/11/2019
 */
public class JdbcCrudWithPreparedStatement {

	private static PreparedStatement stmt = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String query = "INSERT INTO `Student`.`Login` (`username`, `password`, `address`, `phone`, "
				+ "`email`, `age`) VALUES (?,?,?,?,?,?)";
		JdbcCrudWithPreparedStatement.insert(query);
		JdbcCrudWithPreparedStatement.login();
	}

	/**
	 * @Purpose - Used to insert data into database
	 * @param query
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void insert(String query) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionClass.connectionToDB();
		stmt = con.prepareStatement(query);
		System.out.println("Enter User name");
		stmt.setString(1, Util.readString());
		System.out.println("Enter password");
		stmt.setString(2, Util.readString());
		System.out.println("Enter address");
		stmt.setString(3, Util.readString());
		System.out.println("Enter phone number");
		stmt.setString(4, Util.readString());
		System.out.println("Enter emailId");
		stmt.setString(5, Util.readString());
		System.out.println("Enter age");
		stmt.setInt(6, Util.readInt());
		try {
			int value = stmt.executeUpdate();
			if (value > 0) {
				System.out.println("Data inserted");
			} else
				System.out.println("Facing problem to insert data");
		} catch (Exception e) {
			System.out.println("username already exist,please enter another username");
			insert(query);
		}

	}
	/**
	 * @Purpose - Used to validate whether user entered valid username and password
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void login() throws ClassNotFoundException, SQLException
	{
		System.out.println("Enter User name");
		String username = Util.readString();
		System.out.println("Enter password");
		String password = Util.readString();
		Connection con = ConnectionClass.connectionToDB();
		stmt = con.prepareStatement("select *from `Login` where username ='"+username+"'AND password='"+password+"'");
		ResultSet rs = stmt.executeQuery();
		if(rs==null)
		{
			System.out.println("Please enter valid username");
			login();
		}
		while(rs.next())
		{
			System.out.println("Username :"+rs.getString("username"));
			System.out.println("address :"+rs.getString("address"));
			System.out.println("phone number :"+rs.getString("phone"));
			System.out.println("email id :"+rs.getString("email"));
			System.out.println("age :"+rs.getInt("age"));
		}
	}
	
}
