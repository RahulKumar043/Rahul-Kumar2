package com.practice;

import java.sql.Driver;
import java.sql.DriverManager;

import okhttp3.Connection;

public class ExecuteQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver ref=new Driver();
		DriverManager.registerDriver(Driver.ref);
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo");
		Statement stat=con.creatStatement
		
		
	}

}
