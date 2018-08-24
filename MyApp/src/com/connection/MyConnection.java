package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyConnection {
 private static Connection con;
 public static Connection getMyConnection() {
//	 try {
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI","sa","sa123");
//			System.out.println("connection successful");
//						
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	 return con;
	 try {
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:comp/env");
		javax.sql.DataSource ds = (javax.sql.DataSource) envContext.lookup("jdbc/TestDB");
		con = ds.getConnection();
		System.out.println("got connection");
	} catch (NamingException ex) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.err.println(ex);
	}catch (SQLException ex) {
		System.err.println(ex);
	}
	 return con;
	 
 }
 public static void closeMyConnection() {
	 try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}
