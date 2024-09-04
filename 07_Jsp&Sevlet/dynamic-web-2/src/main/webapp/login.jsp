<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-30
  Time: AM 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <h1>로그인</h1>
    <form method="get" action="login">
        <label for="username">아이디 :</label>
        <input type="text" id="username" name="username" required>
        <br>
        <button type="submit">로그인</button>
    </form>
</body>
</html>
