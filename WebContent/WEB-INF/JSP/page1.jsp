<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クリスマスセール抽選会</title>
<%
String Kigen = (String)request.getAttribute("Result");
%>
<%
int num = Integer.parseInt(Kigen);
%>
<style>
body{
		background-color: #efefff; 
		background-repeat: no-repeat;
		background-size: 100% 40%;
	}
	
h1{
		text-shadow: 1px 1px 1px #ff7f7f;
}

h2{
		text-shadow:1px 0 0 #fff,0 1px 0 #fff,-1px 0 0 #fff,0 -1px 0 #fff,1px 1px 0 #fff;
}

</style>

</head>

<body style = "background-image:url(file:///Z:/git/R02OUBO/WebContent/WEB-INF/image/トナカイサンタ.png)">
<br /><br /><br /><br /><br /><br />
<h2>仙台駅前第一デパート</h2>
<h1 style="text-align:center"><font color="00693E">🎄</font><font color="d7c447">クリスマスセール抽選会</font><font color="00693E">🎄</font></h1>

<h2 style="text-align:center">応募ページ</h2><br />

<% 
int K = (int)request.getSession().getAttribute("K");
String flag = (String)request.getAttribute("flag");
String kaisiflag = (String)request.getAttribute("kaisiflag");
String dis=null; 
	if(kaisiflag!=null){
		dis = "disabled";
	}
	if(flag.equals("a")){
%>
	<p>既に登録されている番号です。</p>
<%} else if(flag.equals("b")){%>
	<p>不正な番号です。</p>
<%}%>

<form method="post" action="./page1_2" style="text-align:center">
メールアドレス <input type="email" name="email" placeholder="メールアドレスを入力" <%=dis %>><br/><br />
数字A（7桁）　 <input type="number" name="numa" placeholder="7桁の数字A" <%=dis %>><br/><br />
数字B（7桁） 　<input type="number" name="numb" placeholder="7桁の数字B" <%=dis %>><br/><br /><br /><br />

<% 
		if(num<=10){
%>
<h4 style="text-align:center">応募期限まであと<%=Kigen %>日</h4><br />
<%
		}
%>
<%if(K>=0){ %>
	<div style="text-align:center">開始まであと<%= K %>日です</div><br/>
<%} %>

<div style="text-align:center"><font color="DD4973">🎁</font><font color="93BDC7">🎁</font><input type="submit" value="\ 応募する /" <%=dis %>><font color="F2C744">🎁</font><font color="F29979">🎁</font></div>

</form>


<a href="" disabled>クリスマス</a>

<form method="get" action="./page1V">
<a href="./page1V">バレンタイン</a>
</form>

<form method="get" action="./page1S">
<a href="./page1S">新入学セール</a>
</form>
<p><a href="./page1five">課題5</a></p>
<p><a href="./admin0">管理者画面確認</a></p>
</body>
</html>