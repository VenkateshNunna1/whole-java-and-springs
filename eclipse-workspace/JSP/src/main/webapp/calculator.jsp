<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
     int num1=Integer.parseInt(request.getParameter("num1"));
     int num2=Integer.parseInt(request.getParameter("num2"));
     String operation = request.getParameter("operation");
     
     if(operation.equals("add")){
    	 out.println(num1+num2);
     }
     else  if(operation.equals("sub")){
    	 out.println(num1-num2);
     }
     else  if(operation.equals("mul")){
    	 out.println(num1*num2);
     }
     else{
    	 out.println(num1/num2);
     }
     
  
  
  
  
  %>
</body>
</html>