<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 회원 검색하기 </h1>
<form action="search" method="post" name="member_search">
	아이디 : <input type="text" name="user_id">
	<br>
	<input type="submit" value="검색">
	<p><button type="button" onclick="location.href='index.jsp'">첫 화면으로 돌아가기</button></p>
</form>
</body>
</html>