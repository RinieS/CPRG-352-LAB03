<%-- 
    Document   : ageCalculator
    Created on : Jun 2, 2021, 6:04:45 AM
    Author     : 840979
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
         <form method="post" action="AgeCalculator">
            <label>Enter your age:</label>
            <input type="text" name="age" value="" placeholder="35">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        <p> ${message}</p>
        <a href="Arithmetic">Arithmetic Calculator</a>
    </body>
</html>
