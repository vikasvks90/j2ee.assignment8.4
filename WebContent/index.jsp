<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Custom Tag Example</title>
<%@ taglib uri="WEB-INF/imagetags.tld" prefix="m"%>
</head>
<body>
	<table border="1" cellpadding="2" cellspacing="0">
		<tr>
			<td><m:img url="./images/images_1.jpeg" /></td>
			<td><m:img url="./images/images_2.jpeg" showBorder="false" /></td>
			<td><m:img url="./images/images_3.jpeg" /></td>
			<td><m:img url="./images/images_4.jpeg" showBorder="false" /></td>
		</tr>
	</table>
</body>
</html>