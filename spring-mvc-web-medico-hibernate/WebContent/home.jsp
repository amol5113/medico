<%@page import="com.cdac.springmvcwebhibernate.dto.User1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%
 	User1 user  = (User1)session.getAttribute("user");
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome ! <%=user.getUserName() %></h3>	
	<a href="user_list.htm" >user list</a>
</body>
</html>