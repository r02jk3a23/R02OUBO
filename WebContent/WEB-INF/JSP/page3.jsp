<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String sKigen = (String)request.getAttribute("KIGEN");
%>
<h1>応募は終了しました</h1>
<p>応募は <%=sKigen %> に締め切りました</p>

<p>当選確認するにはメールアドレスを入力してください。
<form method="get" action="page4" >
<input type="email" name="email" />
<input type="submit" value="確認する" /></br></br>
</form>

<form method="get" action="./winner">
<a href="./winner">当選者確認</a>
</form>

</body>
</html>