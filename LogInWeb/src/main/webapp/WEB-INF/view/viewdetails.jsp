<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Details</title>
</head>
<body>
	<a href="register">Regiseration</a>
	<a href="/allUserDetails">All User Details</a>
	<h2> Details as submitted successfully </h2>
	<h4> First Name : ${user.firstName} </h4>
	<h4> Last Name  : ${user.lastName} </h4>
	<h4> User Name  : ${user.userName} </h4>
	
</body>
</html>