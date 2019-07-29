<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>


<!DOCTYPE html>
<html lang="en">
<head>


  <title>Modern Business - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/modern-business.css" rel="stylesheet">

</head>

<body>
			<%-- <form  action="getSymptom" modelAttribute="symptoms">
				<table>
                       
                        <s:select path="symptoms">
							<s:option value="">Select Symptom</s:option>
							<form:option value="4">Fever</form:option>
							<form:option value="3">Back Pain</form:option>
							<form:option value="1">Chest Pain</form:option>
							<form:option value="3">codl</form:option>
						</s:select> 
                        
                		</br>
                        <input type="submit" value="Submit" class="btn btn-danger" style="margin:2px;display-flex:center" />
					</table>             
             </form> --%>
             
             <spr:form action="reg.htm" commandName="symptom" >
		 <spr:select path="Symptoms">
			<spr:option value="admin">Admin</spr:option>
			<spr:option value="operator">Operator</spr:option>
		</spr:select>
		<input type="submit" value="Register" /><br>
	</spr:form>
</body>

</html>