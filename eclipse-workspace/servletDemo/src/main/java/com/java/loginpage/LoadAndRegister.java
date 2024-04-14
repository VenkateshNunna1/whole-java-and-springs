package com.java.loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadAndRegister {
	
    public static Connection loadRegister() throws ClassNotFoundException, SQLException{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection  con =DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "venky");
			return con;
    }
}
