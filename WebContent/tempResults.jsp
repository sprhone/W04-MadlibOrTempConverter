<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Temperature conversion results</title>
		<!--  Author:  Sterling Rhone
				Date:	   18Feb21-->
	</head>
	<body>
		<h1>Celsius: ${convertedTemps.getCelsius()}</h1><br>
		<h1>Fahrenheit: ${convertedTemps.getFahrenheit()}</h1><br><br>
			<p> <a href="tempconverter.jsp">Convert another temperature</a><br>
				<a href="index.jsp">Return to main menu</a>
			</p>
			
	</body>
</html>