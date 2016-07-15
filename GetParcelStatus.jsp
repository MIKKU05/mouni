<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lavender">
<form name="myform" action="GetParcelStatusController" method="post"  onSubmit="return validateForm();">
<table align='center'>
<tr><td><h3>Enter PrrNo to get parcel status</h3></td></tr>
<tr><td>PRR No: <input type="text" name="prrNo" ></td></tr>
<tr><td><input type="submit" value="Check Status"></td></tr>
</table>
</form>
</body>
</html>