<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <h1>SCOPE CHECK</h1>

    <h2>Request 스코프</h2>
    <p>${request}</p>

<%--  브라우저가 종료 되기 전까진 유효  --%>
    <h2>Session 스코프</h2>
    <p>${session != null ? session : "없는데요"}</p>

<%--  서버 꺼지기 전까지 유효  --%>
    <h2>Application 스코프</h2>
    <p>${application != null ? application : "없는데요"}</p>

    <h2>Page 스코프</h2>
    <p>${page}</p>
</body>
</html>
