package com.java.loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class preparedStatementForDatabase {
   public static void createDatabase() throws ClassNotFoundException, SQLException {
	   Connection con =LoadAndRegister.loadRegister();
	   PreparedStatement ps= con.prepareStatement("create database facebook");
	   ps.execute();
   }
}
