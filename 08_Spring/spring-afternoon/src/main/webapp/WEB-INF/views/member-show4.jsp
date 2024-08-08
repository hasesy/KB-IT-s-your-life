<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>회원 목록</title>
</head>
<body>
    <h1>회원 목록 V4</h1>
    <ul>
        <li><b>ID - NAME</b></li>
        <c:forEach var="member" items="${memberList}">
            <li>${member.id} - ${member.name}</li>
        </c:forEach>
    </ul>
</body>
</html>
