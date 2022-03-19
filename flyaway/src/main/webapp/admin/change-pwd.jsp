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
	<form action="changed-pwd.jsp" method="post">
		Enter new password: <input type="text" name="new-pwd" />
		<input type="submit" value="change password" />
	</form>

</body>
</html>