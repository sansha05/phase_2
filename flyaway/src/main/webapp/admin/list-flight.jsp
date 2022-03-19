<%@page import="com.entity.Flight"%>
<%@page import="com.dao.FlightDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

td, th {
	border: 2px solid;
	margin: 5px;
	padding: 5px;
}

th {
	fond-size: 12px;
}

table {
	margin-top: 20px;
}
</style>
</head>
<body>

<jsp:include page="../header.html"></jsp:include>

<%

	List<Flight> fls = FlightDao.getFlight();
	out.println("<table>");
	out.println("<tr><th>Source</th><th>Destination</th><th>Airline</th><th>Price</th></tr>");
	for(Flight fl: fls) {
		out.println("<tr>");
		
		out.println("<td>"+fl.getSource()+"</td>" + "<td>" + fl.getDestination()+"</td>" + "<td>" + fl.getAirlines()+"</td>" + "<td>" + fl.getPrice() + "</td>");
		
		out.println("</tr>");
		
	}
	
	out.println("<a href='admin-option.jsp'><button>Back to Admin page</button></a><br><br>");

%>




</body>
</html>