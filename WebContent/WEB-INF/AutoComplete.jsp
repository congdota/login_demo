<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<sx:head />
<title>Struts2 Json + Ajax Auto Complete</title>
</head>
<body>
	<s:form action="resultAction" namespace="/" method="POST">

		<s:url id="databaseList" action="jsonAction" />

		<sx:datetimepicker name="deliverydate" label="Delivery Date"
			displayFormat="dd/MM/yyyy" />
		<br />
		<sx:tabbedpanel id="tabContainer">
			<sx:div label="Tab 1">Tab 1</sx:div>
			<sx:div label="Tab 2">Tab 2</sx:div>
		</sx:tabbedpanel>

		<sx:autocompleter label="What's your favorite Database Server?"
			href="%{databaseList}" name="yourDatabase" />

		<s:submit value="submit" name="submit" />

	</s:form>
</body>
</html>