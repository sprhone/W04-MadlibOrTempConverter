<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Temperature Converter</title>
		<!--  Author:  Sterling Rhone
				Date:	   18Feb21-->
	</head>
	<body>
		<h1> Temperature converter</h1>
		<form action="convertTempServlet" method="post">
  		<label for="celsius">Celsius:</label><br>
  		<input type="text" name="celsius" size="10" value=""><br>
  		<label for="fahrenheit">Fahrenheit:</label><br>
  		<input type="text" name="fahrenheit" size="10" value=""><br><br>
  		<input type="submit" value="Convert Temperature">
		</form>
	</body>
</html>