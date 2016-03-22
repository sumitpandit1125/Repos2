<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<c:if test="${!(empty sessionScope['info'])}">
	<a href = "LogOut.jsp" onclick="logOut()">Log Out</a>
	<c:out value = "Welcome"></c:out>
	<c:out value = "${sessionScope['info']}"></c:out>
</c:if>
<c:if test="${(empty sessionScope['info'])}">
	
	<c:redirect url="index.jsp"/>
</c:if>

</body>

<script type="text/javascript">
function logOut(){
alert("Logged out succesfully");
	
}
</script>
</html>