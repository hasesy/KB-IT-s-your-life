<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-30
  Time: AM 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%@include file="header.jsp"%>
<h1>작성하신 글의 내용은</h1>
<h2><%= request.getAttribute("post")%></h2>
</body>
</html>
