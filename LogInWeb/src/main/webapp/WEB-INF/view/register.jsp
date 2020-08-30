<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>
	<form method="post" action="registerUser" modelAttribute="user">
		<label> First Name :</label> <input type="text" name="firstName" /></br> <label>
			Last Name :</label> <input type="text" name="lastName"></br> <label>
			User Name :</label> <input type="email" name="userName"></br> <label>
			Password : </label> <input type="password" name="password"></br> <input
			type="submit" value="Submit">
	</form>
</body>
</html>