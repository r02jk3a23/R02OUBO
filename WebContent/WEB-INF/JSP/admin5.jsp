<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>応募件数の多いメールアドレス</h1>
<table>
<% 
String[] email = (String[])request.getAttribute("email");
int [] count = (int[])request.getAttribute("count");
for(int i=0;i<10;i++){
	String mail = email[i];
	int c = count[i];
%>
<tr>
	<td><%=mail %></td><td><%= c %>件</td>
</tr>

<%} %>
</table>
</body>
</html>