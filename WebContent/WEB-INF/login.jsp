<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Đăng nhập</title>
</head>
<body>
	<h1>Login Form:</h1>
	<s:form action="process-login" method="post">
		<s:textfield name="username" key="global.username" size="50" />
		<s:password name="password" key="global.password" size="50" />
		<s:submit name="submit" value="Login" key="global.submit"
			align="center" />
	</s:form>

	<s:url id="vietnam" var="vietnam" namespace="/" action="locale">
		<s:param name="request_locale">vn</s:param>
	</s:url>
	<s:url id="france" var="france" namespace="/" action="locale">
		<s:param name="request_locale">fr</s:param>
	</s:url>
	<s:url id="english" var="english" namespace="/" action="locale">
		<s:param name="request_locale">en</s:param>
	</s:url>

	<s:a href="%{english}">English</s:a>
	<s:a href="%{vietnam}">Vietnam</s:a>
	<s:a href="%{france}">France</s:a>
	<%
		String message = (String) request.getAttribute("message");
		if (!(message == null)) {
			out.println(message);
		} else {
			message = "";
			out.println(message);
		}
	%>
</body>
</html>