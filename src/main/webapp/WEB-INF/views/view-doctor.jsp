<%@page import="java.util.List"%>
<%@page import="com.team.medico.model.*"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
							<%
 								Doctor doctor = (Doctor)request.getAttribute("doctorList"); 	
							%>
<img src="data:image/jpeg;base64,${degree}" alt="..." width="400" height="400">
<img src="data:image/jpeg;base64,${license}" alt="..." width="400" height="400">
<a href="approve_doctor?email=<%=doctor.getEmailId() %>" >Approved</a>

</body>
</html>