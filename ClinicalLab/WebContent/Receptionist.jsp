<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<c:import url="Header.jsp"></c:import>
	<ul>
		<li><a href = "">CreateTestRequest</a></li>
		<li><a href = "">AddTestReport</a></li>
		<li><a href = "">ViewTestReport</a></li>
	</ul>	
</header>



<h2 style="text-align: right">LAB : <c:out value = "${param.labCode}"/> </h2>

<form action="">

	<table>
		<tr>
			<td>Request Number</td>
			<td><input type = "text" name = "reqNum" id ="reqNum"/></td>
			<td>Collection Date</td>
			<td><input type="date" name = "colDate" id = "colDate"/></td>
			<td>Collection Type</td>
			<td>
				<input type="radio" name = "collectionType"/>LAB
				<input type="radio" name = "collectionType"/>Home
			</td>
			
		
		</tr>
		<tr>
			<td>Patient Code</td>
			<td><input type = "text" name = "patCode" id ="patCode"/></td>
			<td>Patient Name</td>
			<td><input type = "text" name = "patName" id ="patName"/></td>
			<td>Patient DOB</td>
			<td><input type = "text" name = "patDOB" id ="patDOB"/></td>
			
		
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type = "text" name = "mobile" id ="mobile"/></td>
			<td>Address</td>
			<td><input type = "text" name = "address" id ="address"/></td>
			<td>Gender</td>
			<td>
				<input type="radio" name = "gender">MALE</input>
				<input type="radio" name = "gender">FEMALE</input>
			</td>
			
		
		</tr>
		<tr>
			<td>Doctor Code</td>
			<td><input type = "text" name = "docCode" id ="docCode"/></td>
			<td colspan="2">Doctor Name</td>
			<td colspan="2"><input type = "text" name = "docName" id ="docName"/></td>
			
			
		
		</tr>
	
	
	</table>

</form>






















<footer>
	<c:import url="Footer.jsp"></c:import>
</footer>
</body>
<script type="text/javascript" src = "jslibs/jquery-2.2.1.js"></script>
<script type="text/javascript" src="SCRIPT/patientAjax.js"></script>
</html>