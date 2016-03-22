<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<table>
	<c:forEach items="${requestScope.studentList}" var = "stud">
		<tr>
			<c:if test="${stud.contains('R')}">
				<td Style = "color:red"><c:out value="${stud}"></c:out></td>
			</c:if>
		
			<c:if test="${!stud.contains('R')}">
				<td Style = "color:blue"><c:out value="${stud}"></c:out></td>
			</c:if>
		</tr>
	</c:forEach>
</table>
</body>
</html>