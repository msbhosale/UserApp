<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="bg-black">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!-- font Awesome -->
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link href="css/AdminLTE.css" rel="stylesheet" type="text/css" />
</head>
<body class="bg-black">
	<div class="form-box" id="login-box">
		<div class="header">Sign In</div>
		<form:form action="/login" method="post" modelAttribute="user">
			<div class="body bg-gray">
				<div class="form-group">
					<form:label path="username">User name</form:label>
					<form:input path="username" type="text" class="form-control" />
				</div>
				<div class="form-group">
					<form:label path="password">Password</form:label>
					<form:input path="password" type="password" class="form-control" />
				</div>
			</div>
			<div class="footer">
				<button type="submit" class="btn bg-olive btn-block">Sign
					me in</button>
				<a href="register" class="text-center">Register a new membership</a>
			</div>
		</form:form>
	</div>


	<!-- jQuery 2.0.2 -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>