<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function() {

	document.getElementById("btnUpdate").onclick = function() {
		
		if(confirm("정말수정할까요")) {
	
			frm.action="update";
			frm.submit();
		}
	}
}
</script>

</head>
<body>
** 수정하기 **
<br>
<form name="frm" method="post">
<table border="2">
	<tr>
		<td>번호</td>
		<td>${dto.num}</td>
		<input type="hidden" value="${dto.num}" name="num">
		
	</tr>
	<tr>
		<td>작성자</td>
		<td>${dto.author}</td>	
	</tr>
		<tr>
		<td>제목</td>
		<td><input type="text" value="${dto.title}" name="title"></td>
	</tr>
		<tr>
		<td>글내용</td>
		<td><textarea rows="5" cols="50" name="content">${dto.author}</textarea></td>
	</tr>
	</tr>
	<tr>
		<td>작성일</td>
		<td>${dto.bwrite}</td>
	</tr>
	<tr>
		<td>조회수</td>
		<td>${dto.readcnt}</td>
	</tr>
		<tr colspan="3">
		<td colspan="3">
		<input type="button" value="수정" id="btnUpdate" style="margin: auto; width: 100%;">
		</td>
	</tr>
</table>
</form>
</body>
</html>