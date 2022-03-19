<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.util.HibernateUtil"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="com.entity.Admin"%>
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

	String new_pwd = request.getParameter("new-pwd");
	
	SessionFactory sf = HibernateUtil.buildSessionFactory();
	Session ses = sf.openSession();
	
	Admin ad = ses.get(Admin.class, 1);
	ad.setPwd(new_pwd);
	
	Transaction tx = ses.beginTransaction();
	ses.save(ad);
	tx.commit();
	ses.close();
	
	out.println("<h3>Password changed</h3>");
	out.println("<a href='admin-login.jsp'><button>Login</button></a>");
	
%>

</body>
</html>