<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.dao.FlightDao"%>
<%@page import="com.entity.Flight"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

th {
	color: blue;
	
}

td, th {
padding: 10px;
}


</style>
</head>
<body>

<jsp:include page="../header.html"></jsp:include>

	<%
	
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		//String airline = request.getParameter("airline");
		
		List<Flight> flights = FlightDao.getFlight();
		boolean gotIt = false;
		
		out.println("<h3>This are the available Flights</h3>");
		out.println("<table>");
		out.println("<tr><th>Flight Name</th><th>Price</th></tr>");
		for(Flight fl: flights) {
			
			if (source.equals(fl.getSource()) && destination.equals(fl.getDestination())){
				
				
				out.println("<tr><td>" + fl.getAirlines() + "</td>" + "<td>" + fl.getPrice() + "</td>" + "<td><a href='book.jsp'><button>Book Ticket</button></a></td></tr>");
				
				gotIt = true;
			}
		}
		out.println("</table>");
		
		
		if(gotIt == false) {
			out.println("<h3 style='color: red'>Flight not available!</h3>");
		}
		
	%>
		

</body>
</html>




