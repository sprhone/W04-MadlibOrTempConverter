<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Madlib maker</title>
		<!--  Author:  Sterling Rhone
				Date:	   18Feb21-->
	</head>
	<body>
		<h1>Madlib maker</h1>
		<form action="madlibMakerServlet" method="post">
  		<label for="name1">Enter a name:</label><br>
  		<input type="text" name="name1" size="20"><br> 		
  		<label for="name2">Enter another name:</label><br>
  		<input type="text" name="name2" size="20"><br> 		
  		<label for="place">Enter a place:</label><br>
  		<input type="text" name="place" size="20"><br> 		
  		<label for="object1">Enter an object:</label><br>
  		<input type="text" name="object1" size="20"><br> 		
  		<label for="object2">Enter another object:</label><br>
  		<input type="text" name="object2" size="20"><br> 		
  		<label for="ptverb">Enter a past tense verb:</label><br>
  		<input type="text" name="ptverb" size="20"><br>	
  		<label for="imaginarycreature">Enter an imaginary creature:</label><br>
  		<input type="text" name="imaginaryCreature" size="20"><br><br>
  		<input type="submit" value="Create a madlib">
		</form>
	</body>
</html>