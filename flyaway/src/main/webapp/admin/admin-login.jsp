<%@page import="org.hibernate.Transaction"%>
<%@page import="com.entity.Admin"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.util.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="../header.html"></jsp:include>


<form action="admin-auth.jsp" method="post">

	Enter password for Admin: <input type="text" name="password" />
	<input type="submit" value="submit" /> <br />
	<p style="color:green;">use admin as default password until you changed it.</p>
</form>

</body>
</html>