<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Student</title>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<form:form action="/Handson_3/dept/addStudent" method="post">

<label>NAME :</label>
<form:input path="stuName"/><br>
<label>Academic Performance :</label>
<form:input path="academicPerformance"/><br>
<label>Academic Events :</label>
<form:input path="academicEvents"/><br>
<label>Sports Activity :</label>
<form:input path="sportsActivity"/><br>
<label>Cultural Activity :</label>
<form:input path="culturalActivities"/><br>
<label>Department</label>
<select id="department" name="department">
    <c:forEach var="item" items="${departments}">
     <option>${item}</option>
    </c:forEach>
</select>

<input type="submit" value = "ADD">


</form:form>

</body>
</html>