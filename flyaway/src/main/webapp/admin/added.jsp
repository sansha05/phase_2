<%@page import="com.dao.FlightDao"%>
<%@page import="com.entity.Flight"%>
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

	String source = request.getParameter("source");
	String destination = request.getParameter("destination");
	String airline = request.getParameter("airline");
	String price = request.getParameter("price");
	
	Flight f1 = new Flight();
	f1.setSource(source);
	f1.setDestination(destination);
	f1.setAirlines(airline);
	f1.setPrice(Double.valueOf(price));
	
	// here i used dao to save data to database.
	FlightDao.saveFlight(f1);
	
	out.println("<h3>Flight detail has been added!</h3>");
	
%>

	<a href="admin-option.jsp"><button>Back to Admin Page</button></a>

</body>
</html>