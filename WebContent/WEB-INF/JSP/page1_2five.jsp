
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
String[] sNum = new String[10];
sNum[0] = request.getParameter("numa1");
sNum[1] = request.getParameter("numb1");
sNum[2] = request.getParameter("numa2");
sNum[3] = request.getParameter("numb2");
sNum[4] = request.getParameter("numa3");
sNum[5] = request.getParameter("numb3");
sNum[6] = request.getParameter("numa4");
sNum[7] = request.getParameter("numb4");
sNum[8] = request.getParameter("numa5");
sNum[9] = request.getParameter("numb5");
%>
<p>メールアドレス：<%=email %></p>
<%for(int i=0;i<5;i++){%>
	番号<%= i+1%><br>
	番号A：<%=sNum[2*i] %><br/>
	番号B：<%=sNum[2*i+1] %><br/>
<%} %>


<form method="post" action="./page2five">
登録しますか?<br/>
<input type="hidden" name="email" value="<%=email%>">
<input type="hidden" name="numa1" value="<%=sNum[0]%>">
<input type="hidden" name="numb1" value="<%=sNum[1]%>">
<input type="hidden" name="numa2" value="<%=sNum[2]%>">
<input type="hidden" name="numb2" value="<%=sNum[3]%>">
<input type="hidden" name="numa3" value="<%=sNum[4]%>">
<input type="hidden" name="numb3" value="<%=sNum[5]%>">
<input type="hidden" name="numa4" value="<%=sNum[6]%>">
<input type="hidden" name="numb4" value="<%=sNum[7]%>">
<input type="hidden" name="numa5" value="<%=sNum[8]%>">
<input type="hidden" name="numb5" value="<%=sNum[9]%>">
<input type="submit" value="登録する">
</form>

</body>
</html>