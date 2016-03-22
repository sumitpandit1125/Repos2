<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri = "http://training.com/examples/greet" prefix = "mytag" %>
</head>
<body>
<mytag:greet userName="Sumit"></mytag:greet>
<%! ArrayList<Object> list1 = null; %>
<% 
	list1 = new ArrayList<Object>();
	list1.add("Sumit");
	list1.add("Rahman");
	list1.add("Pritam");
	list1.add("Nazir");
	//list1 = null;
	pageContext.setAttribute("name", list1);
%>

<mytag:forEach name = "name"></mytag:forEach>
</body>
</html>