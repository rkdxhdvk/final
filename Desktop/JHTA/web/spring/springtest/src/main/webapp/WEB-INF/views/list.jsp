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
<h1>글목록</h1>
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
<br>
<div>
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<c:choose>
			<c:when test="${pu.pageNum==i }">
				<a href="<c:url value='list?pageNum=${i }&field=${field }&keyword=${keyword }'/>">
				<span style="color:blue">[${i }]</span></a>
			</c:when>
			<c:otherwise>
				<a href="<c:url value='list?pageNum=${i }&field=${field }&keyword=${keyword }'/>">
				<span style="color:gray">[${i }]</span></a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
</div>
<div>
	<form method="get" action="<c:url value='list'/>">
		글쓴이<input type="checkbox" id="writer" name="field" value="writer" <c:if test="${field=='writer' }">checked="checked"</c:if>>
		제목<input type="checkbox" id="title" name="field" value="title"  <c:if test="${field=='title' }">checked="checked"</c:if>>
		내용<input type="checkbox" id="content" name="field" value="content" <c:if test="${field=='content' }">checked="checked"</c:if>>
		<input type="text" name="keyword" value=${keyword }>
		<input type="submit" value="검색">
	</form>
</div>
</body>
</html>