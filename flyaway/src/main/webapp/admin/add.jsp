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
	
	<h3>Add Flight Details</h3>
	<form action="added.jsp" method="post">
		Source: <input type="text" name="source" /><br><br>
		Destination: <input type="text" name="destination" /><br><br>
		Airline: <input type="text" name="airline" /><br><br>
		Price: <input type="text" name="price" /><br><br>
		
		<input type="submit" value="Add Flight" />
		
	
	</form>
	

</body>
</html>