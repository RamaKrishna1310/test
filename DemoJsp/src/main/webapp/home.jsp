<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
/*<%= "a value is = +a" %>*/
<%
String user = request.getParameter("username");
String pass=request.getParameter("password");
out.println(user+" "+pass);
response.sendRedirect("https://github.com/RamaKrishna1310/test/settings/access");
%>
</body>
</html>