<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://www.springframework.org/tags" prefix="spring" %>
</head>
<body>

<h1>Display Page</h1>

<c:forEach var="item" items="${departments}">
	<spring:url var="addAction" value="${item}" ></spring:url>
	<a href = "${addAction}">${item}</a>
</c:forEach>
<br>
<c:forEach var = "student" items = "${toppers}">
	<label>${student.stuName}  : </label>
	<label>${student.academicPerformance*0.5 + student.academicEvents*0.1 + student.sportsActivity*0.2 + student.culturalActivities*0.2}</label><br>
</c:forEach>



<a href = "/Handson_3/index.jsp">HOME</a>

</body>
</html>