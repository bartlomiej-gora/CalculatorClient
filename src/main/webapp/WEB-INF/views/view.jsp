<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<spring:url value="css/style.css" />">
    <meta charset="UTF-8">
    <title>RPN calculator Clieant</title>
</head>
<body>
<div id="header">Calculator Web Spring Integration Client</div>
<form action="/clientView" method="POST">
Równianie: <input type="text" name="equation"/></br>
<input type="submit"/>
</form>
</br></br>
Wynik: ${value}

</body>
</html>