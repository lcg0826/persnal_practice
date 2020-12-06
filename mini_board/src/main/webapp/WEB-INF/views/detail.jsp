<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function() {
	document.getElementById("btnList").onclick = function() {
		location.href="boardlist";
	}
	document.getElementById("btnUpdate").onclick = function() {
		
		if(confirm("정말수정할까요")) {
	
			frm.action="update";
			frm.submit();
		}
	}
	document.getElementById("btnDelete").onclick = function() {
		if(confirm("정말 삭제할까요?")) {
			frm.action="delete";
			frm.submit();
		}
	}
}
</script>

</head>
<body>
** 상세보기 **
<br>
<form name="frm" method="get">
<table border="2">
	<tr>
		<td>번호</td>
		<td>${detail.num}</td>
		<input type="hidden" value="${detail.num}" name="num">
		
	</tr>
	<tr>
		<td>작성자</td>
		<td>${detail.author}</td>	
	</tr>
		<tr>
		<td>제목</td>
		<td>${detail.title}</td>
	</tr>
		<tr>
		<td>글내용</td>
		<td><textarea rows="5" cols="50" name="content">${detail.author}</textarea></td>
	</tr>
	</tr>
	<tr>
		<td>작성일</td>
		<td>${detail.bwrite}</td>
	</tr>
	<tr>
		<td>조회수</td>
		<td>${detail.readcnt}</td>
	</tr>
		<tr colspan="3">
		<td>
		<input type="button" value="목록" id="btnList">
		<input type="button" value="수정" id="btnUpdate">
		<input type="button" value="삭제" id="btnDelete">
		</td>
	</tr>
</table>
</form>
</body>
</html>