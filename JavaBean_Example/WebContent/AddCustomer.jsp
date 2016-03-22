<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<header>
	<%@ include file="Header.jsp" %>
</header>

<section>
<form action="ProcessCustomer.jsp">
<label>Customer Id</label>
	<input type = "text" name = "customerId">
<label>Customer name</label>
	<input type = "text" name = "customerName">
<label>Mobile</label>
	<input type = "tel" name = "mobile" placeholder = "9999999999" pattern = "[1-9]{1}[0-9]{9}">
<label>Email</label>
	<input type = "email" name = "email" placeholder = "abc@xyz.com">
	
	<input type = "submit" value = "add">
</form>

</section>

<footer>
	<jsp:include page = "Footer.jsp"/>
</footer>

</body>
</html>