package com.bridgeLabz.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * @author Sourabh Magdum
 * @Purpose - JDBC CRUD operations using Statement
 * Date - 05/11/2019
 */
public class JdbcCRUD {
	public static void main(String[] args) throws Exception {
		String readQuery = "Select * from `Student`.`StudentInfo`";
		String writeQuery = "INSERT INTO `Student`.`StudentInfo` (`Id`, `Name`, `Address`, `Phone`) "
				+ "VALUES ('10', 'Aniket', 'Ghatkopar', '8888161350')";
		String removeQuery = "Delete from `StudentInfo` where id=4";
		String updateQuery = "UPDATE `StudentInfo` SET Name='Pratik' where Id=3 ";
		read(readQuery);
		write(writeQuery);
		remove(removeQuery);
		update(updateQuery);
	}
	
	public static void write(String query) throws Exception
	{
		Connection con = ConnectionClass.connectionToDB();
		Statement stmt=con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Data Successfully inserted into database");
	}
	
	public static void read(String query) throws Exception
	{
		Connection con = ConnectionClass.connectionToDB();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println("Id : "+rs.getInt("ID"));
			System.out.println("Name : "+rs.getString("Name"));
			System.out.println("Address : "+rs.getString("Address"));
			System.out.println("Phone no : "+rs.getString("Phone"));
			System.out.println("***********************");
		}
	}
	public static void remove(String query) throws Exception
	{
		Connection con = ConnectionClass.connectionToDB();
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Data removed successfully");
	}
	
	public static void update(String query) throws Exception
	{
		Connection con = ConnectionClass.connectionToDB();
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("Data Updated Successfully");
	}
}

