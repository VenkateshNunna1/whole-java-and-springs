package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
		Statement st=con.createStatement();
		st.execute("create table student1(id int,name varchar(20),yop int,age int,mob varchar(20))");
		System.out.println("create table successfully");
	}
}
