<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新入学セール抽選会</title>

<style>
body{
		background-repeat: no-repeat;
	}
</style>

</head>
<body style="background-image:url(file:///Z:/git/R02OUBO/WebContent/WEB-INF/image/sakurasha.jpg)">
<h2>仙台駅前第一デパート</h2>
<h1 style="text-align:center"><font color="F25E6B">🌸</font>新入学セール抽選会<font color="F25E6B">🌸</font></h1>
<h2 style="text-align:center">受付ページ</h2><br />
	
<form method="post" action="./page2">
応募者のメールアドレス<input type="email" name="email" placeholder="メールアドレスを入力" /><br/><br />
7桁の数字A<input type="number" name="numa" placeholder="7桁の数字A" /><br/><br />
7桁の数字B<input type="number" name="numb" placeholder="7桁の数字B" /><br/><br/><br />
<div style="text-align:center"><input type="submit" value="一緒にお祝いする🎉" /></div>
</form>

</body>
</html>