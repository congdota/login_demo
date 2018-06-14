<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Đăng nhập thành công</title>
</head>
<body>
Welcome: ${sessionScope.username }
	|
	<a href="logout.html">Logout</a>
	
	<a href="<s:url action="redirectEmail"/>">Send email file here</a>
</body>
</html>