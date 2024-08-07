<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Member Register</title>
</head>
<body>
<%@include file="header.jsp"%>
<h1>할 일 추가 V2</h1>
<form method="get" action="/todo/v2/form/save">
    <label for="todo">할 일 : </label>
    <input type="password" id="todo" name="todo" required>
    <br>
    <button type="submit">할 일 추가</button>
</form>
</body>
</html>
