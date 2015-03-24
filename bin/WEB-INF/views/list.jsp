<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Results Page</title>
</head>
	<body>
		<table border="1" width="100%" >
		<tr>
		<td>${user}</td>
		</tr>
		
		<tr>
			<td>Name</td>
			<td>${user.userName}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${user.age}</td>
		</tr>
		<tr>
			<td> Address</td>
			<td>${user.address}</td>
		</tr>
		
		</table>
		
	</body>
</html>