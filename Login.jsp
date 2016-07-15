<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script>
function validateForm() {
    var userName = document.myform.userName.value;
    if (userName == null || userName == "") {

        alert("Please enter your User Name.");
        return false;
    }

var password = document.myform.password.value;
    if (password== null || password == "") {

        alert("Please enter Password.");
        return false;
    }

}
</script>
</head>

<body  bgcolor="lavender" >


        <br/>

        <form  name="myform" method="post" action="LoginController"   onSubmit= "return validateForm();"   >
       
            <table align=center>
<tr><td><h1 >Welcome to Pluto</h1>
<tr><td><font color='red'>${msg}</font></td></tr>
<tr>
<td>User Id:<input type="text" name="userName"></td>
</tr>
<tr><td>Password:<input type="password" name="password">
</td></tr>
<tr><td><input type="submit" value="Login"/></td></tr>
</table>
            

        </form>
</body>
</html>