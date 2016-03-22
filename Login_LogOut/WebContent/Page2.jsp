<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page 2</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
	
<c:if test="${(empty sessionScope['info'])}">
	<c:redirect url="index.jsp"/>
</c:if>
	
	
	<c:import url="Header.jsp"></c:import>
	<br>
	<h1>Second page</h1><br>
	<c:url value="Page3.jsp" var = "page3"></c:url>
	<a href = "${page3}">Next Page</a>



</body>
</html>