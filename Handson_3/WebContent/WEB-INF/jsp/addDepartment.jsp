<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Department</title>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<form:form action="/Handson_3/dept/addDepartment" method="post">

<label>NAME :</label>
<form:input path="deptName"/><br>


<input type="submit" value = "ADD">


</form:form>


</body>
</html>