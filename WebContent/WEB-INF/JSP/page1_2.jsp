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
String email = (String)request.getAttribute("sEname"); 
String numa = (String)request.getAttribute("sNumA");
String numb = (String)request.getAttribute("sNumB");
%>
<p>メールアドレス：<%=email %></p>
<p>番号A：<%=numa %></p>
<p>番号B：<%=numb %></p>

<form method="post" action="./page2">
登録しますか?<br/>
<input type="hidden" name="email" value="<%=email%>">
<input type="hidden" name="numa" value="<%=numa%>">
<input type="hidden" name="numb" value="<%=numb%>">
<input type="submit" value="登録する">
</form>

</body>
</html>