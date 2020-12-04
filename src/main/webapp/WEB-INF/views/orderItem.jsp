<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cafe Home Page</title>
</head>
<body>
	<h1 align="center">Mom's Cafe</h1>
	<hr>
	<form action="processOrder">
		<div align = "center">
			<label for="food-item"><b>Item Name :</b> </label> 
			<input type="text" id="food-item" placeholder="What do you want to have?" size="30" name = "food-item"/>
			<input type = "submit" value = "Order">
		</div>
	</form>
</body>
</html>