<%@page import="kr.co.bit.day3.FunctionEX"%>
<%@page import="java.io.File"%>
<%@page import="kr.co.bit.day3.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Student> list = (ArrayList<Student>) session.getAttribute("list");
		FunctionEX func = new FunctionEX();
		int count;
		func.problem01(list);
		
	%>
	<table>
		<tr>
			<td>문제1</td>
			<td>문제2</td>
			<td>문제3</td>
			<td>문제4</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td><%
			count = func.problem03(list);
			out.print(count); %></td>
			<td><%
			count = func.problem04(list,"B");
			out.print(count); %></td>
		</tr>
	</table>
</body>
</html>