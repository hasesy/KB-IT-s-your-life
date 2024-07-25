<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-25
  Time: PM 3:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>반복문</title>
    <ul>
        <% int max = 10; %>
        <p>총 <%= max %>번 출력</p>
        <% for (int i = 1; i < max; i++) { %>
        <li><%= i %>번째 반복 중</li>
        <% } %>
    </ul>
</head>
<body>
</body>
</html>
