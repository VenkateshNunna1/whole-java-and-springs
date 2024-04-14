<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
   text-align:center;
   margin-left:600px;
   
}

</style>
</head>
<body>
<%
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/university","root","venky");
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery("select * from student");
    
%>
 <table cellpadding="20px" border="1">
        <th>id</th>
        <th>name</th>
        <th>age</th>
          <%
        while(rs.next()) {
         %>
          <tr>
          <td><%out.print(rs.getInt(1)); %></td>
          <td><%out.print(rs.getString(2)); %></td>
          <td><%out.print(rs.getInt(3)); %></td>
          </tr>
          <%
          } 
          %>
 </table>
</body>
</html>