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

<h3>Search Flight</h3>
<form action="search.jsp">
	Pick Date: <input type="date" name="date" />
	Source: <input type="text" name="source" placeholder="enter source" />
	Destination: <input type="text" name="destination" placeholder="enter destination"/>
	<!-- Choose Airline: <select name="airline">
		<option value="Air India">Air India</option>
		<option value="indigo">IndiGO</option>
		<option value="spicejet">SpiceJet</option>
		<option value="go first">Go First</option>
		<option value="air asia india">Air Asia India</option>
		<option value="vistara">Vistara</option>
		<option value="tru jet">Tru jet</option>
	</select> -->
	<input type="submit" value="submit" />
</form>

</body>
</html>