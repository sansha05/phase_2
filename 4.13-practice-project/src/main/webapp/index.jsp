<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>enter credential to go to dashboard</h3>
	<form action="session.jsp" method="post">
		email: <input type="email" name="email" />
		password: <input type="password" name="pass" />
		
		<input type="submit" value= "submit">
	</form>
	
	<a href="dashboard.jsp">go to dashboard</a>
</body>
</html>