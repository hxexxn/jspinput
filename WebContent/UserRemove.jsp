<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h1>삭제할 아이디를 입력하세요.</h1>
    <form action="removeUser" method="get" name="user_Remove">
	    <input type="text" name="user_ID">
	    <input type="submit" value="등록">
       <p><button type="button" onclick="location.href='index.jsp'">첫 화면으로 돌아가기</button></p>
	</form>
</body>
</html>