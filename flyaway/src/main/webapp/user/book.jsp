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

<h3>Provide details:</h3>
<form action="payment.jsp" method="post"><br /><br/>
	Name: <input type="text" name="name" /><br /><br/>
	Age: <input type="number" name="age" /><br /><br/>
	Date Of Birth: <input type="date" name="dob" /><br /><br/>
	Phone Number: <input type="number" name="phone" /><br /><br/>
	Email: <input type="email" name="email" /><br /><br/>
	
	<input type ="submit" value="pay now" />
	
	
</form>

</body>
</html>