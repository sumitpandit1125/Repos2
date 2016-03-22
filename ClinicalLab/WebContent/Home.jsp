<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LAB</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<style type="text/css">
	a {
		border: menu;
		text-decoration: none;
		color: black;
	}
	
	table,tr,td{
		border: solid;
		border-color: red;
		border-collapse: collapse;
		text-align: center;
		margin-left: auto;
		margin-right: auto;
	}
	
	ul{
		padding-top : 5px;
		background-color: green;
		padding-bottom : 5px;
		font-style: italic;
	}
	li{
		display: inline;
		background-color: yellow;
		border-radius: 20px 5px 20px 5px;
	}

</style>
</head>
<body>

<header>
	<div>
		<a href = "Home.jsp?lang=en"><img alt="fr" src="IMAGES/india.png" height = "30px" style = "float: right"/></a>
		<a href = "Home.jsp?lang=fr"><img alt="in" src="IMAGES/france.jpg" height = "30px" style = "float: right"/></a>
		<br><br>
	</div>
	<c:import url="Header.jsp"></c:import>
	
	<ul>
		<li><a href = "">Doctor</a></li>
		<li><a href = "">Patient</a></li>
		<li><a href = "">Test</a></li>
		<li><a href = "">Help</a></li>
	</ul>		
	
	
</header>
<fmt:setLocale value="${param.lang}"/>
<fmt:setBundle basename="MessageResource" var='msg' scope = "page"/>

<form action="validateUser" method="get">
	<h2 style = "text-align: center;">Registered User</h2>
	<table>
	
	<tr>
		<td><fmt:message key="forms.label.role" bundle="${msg}"/></td>
		<td>
			<select name = "role">
				<option>ADMIN</option>
				<option>MANAGER</option>
				<option>LABTECH</option>
				<option>RECEPTIONIST</option>				
			</select>
		</td>
	</tr>
	
	<tr>
		<td><fmt:message key="forms.label.labCode" bundle="${msg}"/></td>
		<td>
			<input type="text" name="labCode" id="labCode" list="jSonList" placeholder="CITY123">
			<datalist id = "jSonList"></datalist>
		</td>
	</tr>
	
	<tr>
		<td><fmt:message key="forms.label.userName" bundle="${msg}"/></td>
		<td><input type = "text" name = "userName" id = "userName"></td>
	</tr>
	
	<tr>
		<td><fmt:message key = "forms.label.passWord" bundle="${msg}"/></td>
		<td><input type = "password" name = "passWord" id = "passWord"></td>
	</tr>
	
	<tr>
		<td colspan = 2><input type="submit" value = "<fmt:message key = "forms.label.logIn" bundle="${msg}"/>"> </td>
	</tr>
	
		
	
	</table>
	
</form>

<footer>
	<c:import url="Footer.jsp"></c:import>
</footer>

</body>
<script type="text/javascript" src = "SCRIPT/ajaxCall.js"></script>


</html>