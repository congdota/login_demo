
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home Page</title>
</head>
<body>
	<s:form action="Welcome" namespace="/">
	
		<s:textarea name="aboutMe" label="About You" cols="20" rows="3"
			wrap="true"></s:textarea>

		<s:select list="{'Developer','Manager','Customer','abc','test'}" name="rolesSelect"
			multiple="true"></s:select>
		<s:checkboxlist list="{'Developer','Manager','Customer'}"
			name="roleCheckbox"></s:checkboxlist>

		<s:radio list="{'Developer','Manager','Customer'}" name="rolesRadio"
			></s:radio>

		<s:doubleselect list="{'Developer','Manager','Tester'}"
			name="doubleSelectRole" label="Role"
			doubleList="top == 'Developer' ? {'Java','PHP'} : (top == 'Manager' ? {'HR Manager', 'Finance Manager'} : {'UI Testing', 'Functional Testing'})"
			doubleName="doubleSelectExpertise"></s:doubleselect>

		<s:submit value="Submit"></s:submit>
	</s:form>
</body>
</html>