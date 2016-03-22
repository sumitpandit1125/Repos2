<%@ page import = "com.training.entity.*, java.util.List" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CustomerList</title>
</head>
<body>
<%

List<Customer> custList = (List<Customer>) request.getAttribute("custList");
%><table><%
for (Customer cust : custList){
	
	out.println(cust);
	%><br><%
}
%></table><%
%>


</body>
</html>