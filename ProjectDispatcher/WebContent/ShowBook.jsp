<%@ page import = "java.util.*,Com.training.entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
 tr,table,td {
 	border-style : solid;
 	border-collapse : collapse;
 	
 }

</style>
</head>
<body>




<%

	HashMap<Long,Book> bookList = (HashMap<Long,Book>)request.getAttribute("foundBooks");
	out.println("<table>");	
	Set<Long> bookIdSet = bookList.keySet();
		for(Long bookId : bookIdSet){
			Book book = bookList.get(bookId);
			
			out.println("<tr><td>" +book.getBookNumber() + "</td><td>" + book.getBookName() + "</td></tr>" );
			
			
		}
	
	out.println("</table>");	


%>

</body>
</html>