<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新入学セール抽選会</title>

<style>
body{
		background-color: #add8e6; 
		background-repeat: no-repeat;
		background-size: 100% 60%;
	}
	
h1{
		text-shadow: 1px 1px 1px #4169e1;
}

h2{
		text-shadow:1px 0 0 #fff,0 1px 0 #fff,-1px 0 0 #fff,0 -1px 0 #fff,1px 1px 0 #fff;
}

</style>

</head>
<body style="background-image:url(file:///Z:/git/R02OUBO/WebContent/WEB-INF/image/sakuraka.png)">
<br /><br /><br /><br /><br /><br />
<h2>仙台駅前第一デパート</h2>
<h1 style="text-align:center"><font color="F25E6B">🌸</font><font color="fffacd">新入学セール抽選会</font><font color="F25E6B">🌸</font></h1>
<h2 style="text-align:center">受付ページ</h2><br />
	
<form method="post" action="./page2" style="text-align:center">
メールアドレス <input type="email" name="email" placeholder="メールアドレスを入力" /><br/><br />
数字A（7桁）　 <input type="number" name="numa" placeholder="7桁の数字A" /><br/><br />
数字B（7桁） 　<input type="number" name="numb" placeholder="7桁の数字B" /><br/><br /><br /><br />
<div style="text-align:center"><input type="submit" value="一緒にお祝いする🎉" /></div>
</form>

<form method="get" action="./page1">
<a href="./page1">クリスマス</a>
</form>

<form method="get" action="./page1-val">
<a href="./page1-val">バレンタイン</a>
</form>

<a href="" disabled>新入学セール</a>
</body>
</html>