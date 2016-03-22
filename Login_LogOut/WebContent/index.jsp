<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login_LogOut</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

	

<form action = "MainServlet">
	User Name : <input type = "text" name = "userName"><br>
	Password  : <input type = "password" name = "passWord"><br>
	<input type="Submit" value = "LogIn">
</form>
	

</body>
</html>