<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style = "text-align : center;">

	Welcome : <%=session.getAttribute("userName") %>
	Location : <%=request.getAttribute("location") %>
	phone NUmber : <%=application.getAttribute("phoneNumber") %>
</div>
New Session := <span style = "color : red"><%=session.isNew() %></span>
Session ID := <span style = "color : blue"><%=session.getId() %></span>
<% session.invalidate(); %>
</body>
</html>