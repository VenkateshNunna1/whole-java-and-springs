<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","venky");
      Statement st = con.createStatement();
       ResultSet rs= st.executeQuery("select * from student1");
  %>
       <table cellpadding="20px" border="1">
        <th>id</th>
        <th>name</th>
        <th>yop</th>
        <th>age</th>
        <th>mob</th>
        <th>delete</th>
        <%while(rs.next()){
        %>
        <tr>
        <td><%=rs.getInt(1) %></td>
        <td><%=rs.getString(2) %></td>
        <td><%=rs.getInt(3) %></td>
        <td><%=rs.getInt(4) %></td>
        <td><%=rs.getString(5) %></td>
        <td><a href="delete.jsp?id=<%= rs.getInt(1) %>">delete</a></td>
        </tr>
        <%} %>
       </table>
</body>
</html>