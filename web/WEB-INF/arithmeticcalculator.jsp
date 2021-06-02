<%-- 
    Document   : arithmeticcalculator
    Created on : Jun 2, 2021, 7:25:10 AM
    Author     : 840979
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
         <form method="post" action="Arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="" >
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="" >
            <br>
            <input type="submit" value="+" name="calc">
            <input type="submit" value="-" name="calc">
            <input type="submit" value="*" name="calc">
            <input type="submit" value="%" name="calc">
        </form>
        <p> Result: ${result}</p>
        <a href="AgeCalculator">Age Calculator</a>
    </body>
</html>
