<%@page import="kr.co.bit.day3.FunctionEX"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="kr.co.bit.day3.Student"%>
<%@page import="java.io.File"%>
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
		String path = application.getRealPath("WEB-INF/file/Abc1115.txt");
		File file = new File(path);
		//1.파일을 읽어들이기 
		FunctionEX func = new FunctionEX();
		List<Student> list = new ArrayList<Student>();
		list = func.read(file);

		session.setAttribute("list", list);
		response.sendRedirect("list.jsp");
	%>
</body>
</html>