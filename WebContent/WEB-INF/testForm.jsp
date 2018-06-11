<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Struts 2 UI tags example</title>
</head>
<body>
	<h3>Test Form</h3>

	<s:property value="message" />
	<br />

	<s:form action ="Test">
		<s:textarea lable="About me" name="aboutMe" cols="40" rows="5">
		</s:textarea>
		<s:submit value="Submit" />
	</s:form>
</body>
</html>