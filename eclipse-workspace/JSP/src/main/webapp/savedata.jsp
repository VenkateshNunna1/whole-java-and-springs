<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
    int id= Integer.parseInt(request.getParameter("id"));
    String name =request.getParameter("name");
    int age = Integer.parseInt(request.getParameter("age"));
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
    PreparedStatement ps = con.prepareStatement("insert into student(id,name,age) values(?,?,?)");
    ps.setInt(1, id);
    ps.setString(2,name);
    ps.setInt(3, age);
    ps.execute();
    out.print("data saved successfully");
    
%>

</body>
</html>