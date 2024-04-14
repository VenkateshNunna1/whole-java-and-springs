package com.java.loginpage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementForTable {
   public static void createTable() throws ClassNotFoundException, SQLException {
	   Connection con =LoadAndRegister.loadRegister();
	   PreparedStatement ps= con.prepareStatement("create table SignUpDetails(id int,email varchar(30),password varchar(20),phoneNo int)");
	   ps.execute();
   }
}
