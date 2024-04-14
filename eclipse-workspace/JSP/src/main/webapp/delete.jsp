<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
     int id = Integer.parseInt(request.getParameter("id"));
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
     PreparedStatement ps =con.prepareStatement("delete from student1 where id=?");
     ps.setInt(1,id);
     ps.execute();
     RequestDispatcher rd = request.getRequestDispatcher("url_rewriting.jsp");
     rd.forward(request,response);
     
%>
</body>
</html>