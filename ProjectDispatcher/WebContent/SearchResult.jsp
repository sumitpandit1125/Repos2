<%@ page import = "Com.training.entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Book bk = (Book) request.getAttribute("foundBook");
	if(bk == null){
		out.println("Book Not found");
	}
	else{
		out.println("<table><tr><td>" + bk.getBookNumber() + "</td><td>" + bk.getBookName() + "</td></tr></table>" );
	}

%>



</body>
</html>