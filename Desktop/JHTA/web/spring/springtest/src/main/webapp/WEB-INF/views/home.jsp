<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>최신글</h1>
	<table border="1" width="500">
	<tr>
		<th>글번호</th>
		<th>글제목</th>
		<th>작성자</th>
		<th>작성일</th>
	</tr>
	<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.num }</td>
			<td>${vo.title }</td>
			<td>${vo.writer }</td>
			<td>${vo.regdate }</td>
		</tr>
	</c:forEach>
</table>
	<a href="insert">글등록</a><br>
	<a href="list">공지사항</a>
</body>
</html>