<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クリスマスセール抽選会</title>

<style>
body{
		background-color: #efefef; 
		background-repeat: no-repeat;
		background-size: contain;
	}
	
h1{
		text-shadow: 1px 1px 1px #ff7f7f;
}
</style>

</head>

<body style = "background-image:url(file:///Z:/git/R02OUBO/WebContent/WEB-INF/image/トナカイサンタ.png)">
<br /><br /><br /><br /><br /><br />
<h2>仙台駅前第一デパート</h2>
<h1 style="text-align:center"><font color="00693E">🎄</font><font color="d7c447">クリスマスセール抽選会</font><font color="00693E">🎄</font></h1>

<h3 style="text-align:center">応募ページ</h3><br />

<form method="post" action="./page2">
メールアドレス <input type="email" name="email" placeholder="メールアドレスを入力" /><br/><br />
数字A（7桁）　 <input type="number" name="numa" placeholder="7桁の数字A" /><br/><br />
数字B（7桁） 　<input type="number" name="numb" placeholder="7桁の数字B" /><br/><br /><br />
<div style="text-align:center"><font color="DD4973">🎁</font><font color="93BDC7">🎁</font><input type="submit" value="\ サンタさんにお願いする✉ /" /><font color="F2C744">🎁</font><font color="F29979">🎁</font></div>
</form>

</body>
</html>