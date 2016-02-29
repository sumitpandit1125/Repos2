<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Server Page</title>
</head>
<body>

<%-- Declaration --%>

	<%! String title = "Welcome to JSP Programing"; %>


<!--  Expression  -->
	
	<div style = "text-align: center">
	<%=title %>

<%-- Implicit Object and local variable --%>
	<%
	
		String author = "Ramesh";
		out.println("<br>----DEsigned by "+ author);
	%>
	
	
	</div>
	
	
</body>
</html>