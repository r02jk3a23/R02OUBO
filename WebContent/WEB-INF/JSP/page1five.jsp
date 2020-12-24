<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>仙台駅前第一デパート　セール抽選会　受付会場</h1>
<% String flag = (String)request.getAttribute("flag");
	if(flag!=null){
%>
	<p>※不正な番号が入力されました。正しい番号を入力してください。</p>
<%
	}
%>
<form method="post" action="./page1_2five">
応募者のメールアドレス<input type="email" name="email" placeholder="メールアドレスを入力" /><br/>
<%for(int i=0;i<5;i++){ %>
番号<%= i+1%><br>
7桁の数字A<input type="number" name="numa<%=i+1 %>" placeholder="7桁の数字A" /><br/>
7桁の数字B<input type="number" name="numb<%=i+1 %>" placeholder="7桁の数字B" /><br/>
<br/>
<%} %>
<input type="submit" value="登録する" />
</form>



</body>
</html>