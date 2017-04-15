<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<spring:url value="css/style.css" />">
<script type="text/javascript" src="webjars/jquery/2.2.2/jquery.min.js"></script>
<script type="text/javascript" src="<spring:url value="js/rpnCalculator.js"/> " ></script>
    <meta charset="UTF-8">
    <title>RPN calculator Clieant</title>
</head>
<body>
<div id="header">Calculator Web Spring Integration Client</div>
<form action="/calculatorClientView" method="POST">
Równianie: <input type="text" id="equation"/></br>
<input type="submit"></input>
</form>
</br></br>
Wynik: ${value}

</body>
</html>