<%@ page isErrorPage="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyExpectionHandler</title>
</head>
<body>
<h1>Exception Handler</h1>

Exception Message : <p style = "color : red"><%=exception.getMessage() %></p>
Exception Class : <p style = "color : blue"><%= exception.getClass() %></p>

<a href = "AddCustomer.jsp">Try Again</a>

</body>
</html>