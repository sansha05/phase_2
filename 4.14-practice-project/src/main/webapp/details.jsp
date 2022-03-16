<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	
	String product_name = request.getParameter("product-name");
	String price = request.getParameter("price");
	%>
	
	
	<h2>Products entered by you:</h2>
	<h3>Product Name: <%=product_name %></h3>
	<h3>Price: <%=price %></h3>
	
</body>
</html>