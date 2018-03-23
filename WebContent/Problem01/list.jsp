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
<style type="text/css">
table {
	text-align : center;
	border: 1px solid black;
}

td {
	border: 1px solid black;
}
</style>

</head>
<body>
	<!-- 표 형식으로 출력 -->
	<%
		List<Student> list = (List) session.getAttribute("list");
	%>
	<table>
		<tr>
			<td>학번</td>
			<td>이메일</td>
			<td>국어 점수</td>
			<td>영어 점수</td>
			<td>수학 점수</td>
			<td>과학 점수</td>
			<td>국사 점수</td>
			<td>총점</td>
			<td>담임 코드</td>
			<td>성취도</td>
			<td>지역 코드</td>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
				out.print("<tr>");
				out.print("<td>");
				out.print(list.get(i).getNo());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getMail());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getK_score());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getE_score());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getM_score());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getS_score());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getH_score());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getScore());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getTeacher());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getArchivement());
				out.print("</td>");
				out.print("<td>");
				out.print(list.get(i).getRegion_code());
				out.print("</td>");
				out.print("</tr>");
			}
		%>
	</table>
</body>
</html>