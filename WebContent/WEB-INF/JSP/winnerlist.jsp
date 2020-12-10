<%@page import="java.util.List"%>
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
	List<String[]> list = 
		(List<String[]>)request.getAttribute("result");
%>
<table border=1>
<TR>
<TH>EMAIL</TH>
</TR>
<% 
	for(String[] s: list){
%>
	<tr>
		<TD><%= s[0] %></TD>
	</tr>
<%
	}
%>
</table>

<form method="get" action="./page3">
<a href="./page3">戻る</a>
</form>

</body>
</html>