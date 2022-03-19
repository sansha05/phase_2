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


<%

	String password = request.getParameter("password");
	SessionFactory sf = HibernateUtil.buildSessionFactory();
	Session ses = sf.openSession();
	Admin ad = ses.get(Admin.class, 1);
	ses.close();
	
	if (ad.getPwd().equals(password)) {
		response.sendRedirect("admin-option.jsp");
	} else {
		out.println("<h3>Enter correct password!</h3>");
	}
	
%>

</body>
</html>