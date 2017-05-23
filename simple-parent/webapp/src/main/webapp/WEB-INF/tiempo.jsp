<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>El tiempo</title>

<link rel="stylesheet" type="text/css" href="css/tiempo.css">
</head>
<body>

<h1>El tiempo en Zalla</h1>

<jsp:useBean id="weather" scope="request" class="org.sonatype.mavenbook.weather.Weather"></jsp:useBean>

<table border="1">
<tr>

<th>Lugar</th>
<th>Temperatura</th>
<th>Condicion</th>
<th>Humedad</th>
<th>Viento</th> 
</tr>
<tr>
 <td>
 		<jsp:getProperty property="city" name="weather"/>,&nbsp; 
		<jsp:getProperty property="region" name="weather"/>,&nbsp;
		<jsp:getProperty property="country" name="weather"/>
 
 </td>
 


<td> 
		<jsp:getProperty property="tempFormateado" name="weather"/></td>
		


<td> 
		 
		 <jsp:getProperty property="condition" name="weather"/>
		 
</td>
		 


 <td>
 		<jsp:getProperty property="humidity" name="weather"/>
 		
 </td>
 


<td>

		<jsp:getProperty property="chill" name="weather"/>
</td>
</tr>
</table>
</body>
</html>