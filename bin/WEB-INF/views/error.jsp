<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ERROR PAGE</title>
<script src='<c:url value="/app/js/jquery-1.11.2.min.js"/>'>
</script>
<script src='<c:url value="/app/js/bootstrap.js"/>'>

</script>
</head>
<div class="container">
  <div class="jumbotron">
<body>
<h1> ERROR :--> ${Exception}</h1>
</div>
<img src='<c:url value="/app/images/error.jpg/"/>' style="width:500px;height:428px"/>
</div>
</body>
</html>