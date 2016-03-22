<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>showAllRequest</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri = "http://www.springframework.org/tags" prefix="spring" %>
</head>
<body>

<h1>Show all request</h1>

<table>
	<c:forEach items="${reqList}" var = "req">
		<tr>
			<td><spring:url value="/findRequest/${req.name}" var = "url" htmlEscape="true"></spring:url><a href = ${url}>${req.name}</a></td>
			<td><c:out value="${req.mobileNumber}"></c:out></td>
		</tr>	
	</c:forEach>
</table>

</body>
</html>