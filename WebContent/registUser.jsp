<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="registUser" name="regist_User" method="post">
	
	<b>ID : </b><br>
	<input type="text" name="input_ID"><br><br>
	<b>PW : </b><br>
	<input type="password" name="input_PW"><br><br>
	<b>NAME : </b><br>
	<input type="text" name="input_Name"><br><br>
	<b>EMAIL : </b><br>
	<input type="text" name="input_Email"><br><br>
	<input type="submit" value="CONFIRM">
	<p><button type="button" onclick="location.href='index.jsp'">첫 화면으로 돌아가기</button></p>
	
	
	
	</form>




</body>
</html>