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
	<!-- <form action="process-login.html" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form> -->
<%-- 	<s:actionerror /> --%>
	<%-- <s:form action="process-login.html" method="post">
		<s:textfield name="username" label="Name" size="50"/>
		<s:password name="password" label="Password" size="50"/>
		<s:submit value="Login" label="Submit" align="center"  />
	</s:form> --%>
	<s:form action="process-login.html" method="post">
		<s:textfield name="username" key="global.username" size="50"/>
		<s:password name="password" key="global.password" size="50"/>
		<s:submit name="submit" value="Login" key="global.submit" align="center"  />
	</s:form>
	
	<s:url id="vietnam" namespace="/" action="locale">
		<s:param name="request_locale" >vn</s:param>
	</s:url>
	<s:url id="france" namespace="/" action="locale">
		<s:param name="request_locale" >fr</s:param>
	</s:url>
	<s:url id="english" namespace="/" action="locale">
		<s:param name="request_locale" >en</s:param>
	</s:url>
	
	<s:a href="%{english}">English</s:a>
	<s:a href="%{vietnam}">Vietnam</s:a>
	<s:a href="%{france}">France</s:a>
	<%
		String message = (String) request.getAttribute("message");
		if(!(message == null)){
			out.println(message);
		}else{
			message = "";
			out.println(message);
		}
	%>
</body>
</html>