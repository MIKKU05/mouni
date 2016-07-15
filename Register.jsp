<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script>
function validateForm() {
    var userId = document.myform.userId.value;
    if (userId == null || userId == "") {

        alert("Please enter your userId");
        return false;
    }

var password = document.myform.password.value;
    if (password == null || password == "") {

        alert("Please enter password.");
        return false;
    }
var name = document.myform.name.value;
    if (name == null || name == "") {

        alert("Please enter Username");
        return false;
    }
var mobileNo = document.myform.mobileNo.value;
    if (mobileNo == null || mobileNo == "") {

        alert("Please enter mobileNo.");
        return false;
    }
var address = document.myform.address.value;
    if (address == null || address == "") {

        alert("Please enter address");
        return false;
    }
}
</script>
</head>
<body>
<body bgcolor="lavender" >
<center><h3>Register here</h3></center>
 <form action='RegisterController' name="myform" onSubmit= "validateForm() ;" method="post">
<table align="center" >

<tr><td><font color='red'>${msg}</font></td></tr>
<tr>
<td width="207" >Userid</td>
<td width="219"><input name='userId' type='text' /></td>
</tr>
<tr>
<td >Password</td>
<td ><input name='password' type='password' /></td>
</tr>
<tr>
<td width="207" >UserName</td>
<td width="219"><input name='name' type='text' /></td>
</tr>
<tr>
<td >Mobile Number</td>
<td><input name='mobileNo' type='text' /></td>
</tr>
<tr>
<td >Address</td>
<td><input name='address' type='text' /></td>
</tr>
<tr>
<td></td>
<td><input name="submit" type='submit'  value='REGISTER'/></td>
</tr>
</table>
</form>
</body>
</html>