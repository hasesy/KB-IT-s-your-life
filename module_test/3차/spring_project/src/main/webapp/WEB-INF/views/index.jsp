<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="./layouts/header.jsp" %>

<%-- 개별 페이지 --%>
<h1>구현 목록</h1>

<div>
  <a href="board/create">
    <button style="background: blue; color: white; font-size: 20px;">게시판 글쓰기</button> <br></a>
  <br>
  <a href="board/list">
    <button style="background: blue; color: white; font-size: 20px;">게시판 글목록</button> <br>
  </a>
  <hr color="red">
  <a href="api/board/list">
    <button style="background: blue; color: white; font-size: 20px;">게시판 글목록(rest)</button> <br></a>
  <br>
  <a href="api/board/1">
    <button style="background: blue; color: white; font-size: 20px;">게시판 번호1번 상세 검색(rest)</button> <br>
  </a>
</div>

<%@ include file="./layouts/footer.jsp" %>
