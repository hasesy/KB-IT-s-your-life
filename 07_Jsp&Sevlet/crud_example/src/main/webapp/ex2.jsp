<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ex2</title>
</head>
<body>
<%@ include file="header.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${condition}">
    <h1>${msg1}</h1>
</c:if>
<c:if test="${!condition}">
    <h1>${msg2}</h1>
</c:if>

<c:forEach var="menu" items="${lunchList}">
    <li>${menu}</li>
</c:forEach>
</body>
</html>
