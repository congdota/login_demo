<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Infomation Form</h3>
	About You: <s:property value="aboutMe"></s:property><br>
	Roles Selected: <s:property value="rolesSelect"/><br>
	Role Checkbox Value: <s:property value="roleCheckbox"/><br>
	Roles Radio Value: <s:property value="rolesRadio"/><br><br>
	Double Select Role: <s:property value="doubleSelectRole"/><br>
	Double Select Expertise: <s:property value="doubleSelectExpertise"/><br>
	
</body>
</html>