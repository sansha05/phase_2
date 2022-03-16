<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		session.setAttribute("email", email);
		session.setAttribute("pass", pass);
	%>
	
	<jsp:forward page="dashboard.jsp"></jsp:forward>

</body>
</html>