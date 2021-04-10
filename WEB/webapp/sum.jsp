<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "kr.web.util.*" %>
<% 
	MyUtil myutil = new MyUtil(); 
	int a = 100;
	int result = myutil.sum(a);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1">
		<tr>
			<td>1~<%=a %>까지의 총합</td>
			<td><%=result %></td>
		</tr>
	</table>
</body>
</html>