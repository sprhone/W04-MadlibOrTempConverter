<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Madlib results</title>
		<!--  Author:  Sterling Rhone (edited MadLibsRhone from Java I)
				Date:	   18Feb21-->
	</head>
	<body>
		<h1>Once upon a time...</h1>
		<p>${madeMadlib.getName1()} grabbed a ${madeMadlib.getObject1()} and ${madeMadlib.getPtverb()} into <br>
			the heart of the ${madeMadlib.getPlace()} to save ${madeMadlib.getName2()}. <br>
			${madeMadlib.getName1()} found a ${madeMadlib.getObject2()} to give to the dreaded ${madeMadlib.getImaginaryCreature()}. <br>
			The ${madeMadlib.getImaginaryCreature()} was pleased with the new gift and released ${madeMadlib.getName2()}. <br>
			Finding that the ${madeMadlib.getImaginaryCreature()} was just lonely, ${madeMadlib.getName1()} and ${madeMadlib.getName2()} <br>
			hung out with the ${madeMadlib.getImaginaryCreature()}, and they all became best friends. <br>
		</p>
		<h2>The end...</h2><br><br>
		<p> <a href="madlib.jsp">Create another madlib</a><br>
			<a href="index.jsp">Return to main menu</a>
		</p>
	</body>
</html>