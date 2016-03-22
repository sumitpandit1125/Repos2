<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CarRequest</title>

<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>

<form:form method="post" action = "CarRequest">

	<form:errors path="*"></form:errors>
	<br>
	<label>Name</label>
	<form:input path="name"/>
	<br>
	<label>Mobile</label>
	<form:input path="mobileNumber"/>
	<br>
	<label>Email</label>
	<form:input path="email"/>
	<br>
	<label>Type</label>
	<form:select path="type" items = "${carType}"></form:select>
	<br>
	<input type = "submit" value = "add">
</form:form>

</body>
</html>