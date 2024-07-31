<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <h1>EL 문법의 Scope 확인용 페이지</h1>

    <h2>Request 스코프</h2>
    <p>${request}</p>
    <p><%= request.getAttribute("request")%></p>

    <h2>Session 스코프</h2>
    <p>${session}</p>

    <h2>Application 스코프</h2>
    <p>${application}</p>

    <h2>Page 스코프</h2>
    <%
        pageContext.setAttribute("page", "Page 스코프에 저장한 데이터");
    %>
    <p>${page}</p>
</body>
</html>
