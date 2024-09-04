<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<%@include file="../layouts/header.jsp"%>

<h1 class="page-header my-4"><i class="fas fa-list"></i> 글 목록</h1>

<table class="table table-hover">
    <thead>
    <tr>
        <th style="width: 60px">No</th>
        <th>제목</th>
        <th style="width: 100px">작성자</th>
        <th style="width: 250px">등록일</th>
    </tr>
    </thead>
    <tbody>
    <!--


    문제 2번: JSP코드 구현 부분

    조건1- jstl을 이용하여 반복문 처리해야함.

    조건2- 게시판 제목을 클릭했을 때 해당 번호에 맞는 상세페이지를 호출하도록 a태그로 링크 처리해야함.

    -->
    <c:forEach var="board" items="${list}">
        <tr>
            <td>${board.no}</td>
            <td><a href="http://localhost:8080/board/get?no=${board.no}">${board.title}</a></td>
            <td>${board.writer}</td>
            <td>${board.regDate}</td>
        </tr>
    </c:forEach>


    </tbody>

</table>

<div class="text-right">
    <a href="create" class="btn btn-primary">
        <i class="far fa-edit"></i>
        글쓰기
    </a>
</div>

<%@include file="../layouts/footer.jsp"%>
