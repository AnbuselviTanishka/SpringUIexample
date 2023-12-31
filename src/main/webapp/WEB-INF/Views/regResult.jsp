<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.spring.springcontrolui.SpringUIexample.model.*"%> 
<%@page import="java.util.*"%> 
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> User Register Successfully</h1>
    <h1>The User id is <%=request.getAttribute("id")%> </h1>
    <h1>The User name is <%=request.getAttribute("name")%> </h1>
    <h1>The User email is <%=request.getAttribute("email")%> </h1>

</body>
</html>