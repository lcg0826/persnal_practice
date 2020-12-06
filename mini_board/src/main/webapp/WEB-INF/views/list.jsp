<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
** 미니 게시판 **<Br>
<br>
<hr>
<a href="insert">글쓰기</a>
<hr>
<br>

<table border="2">
	<tr>
		<th>번호</th><th>제목</th><th>작성자</th><th>조회수</th>	
	</tr>
		<c:forEach var="s" items="${list}">
	<tr>
			<td>${s.num}</td>
			<td><a href="detail?num=${s.num}">${s.title}</a></td>
			<td>${s.author}</td>
			<td>${s.readcnt}</td>
	</tr>
		</c:forEach>
		<form action="search">
			<tr colspan="4">
				<td>
					<select name="searchName">
					<option value="author">작성자</option>
					<option value="title">글제목</option>
					</select>
				</td>
				<td colspan="2">
				<input type="text" name="searchValue">
				</td>
				<td>
				<input type="submit" value="검색">
				</td>
			</tr>	
		</form>
</table>
</body>
</html>