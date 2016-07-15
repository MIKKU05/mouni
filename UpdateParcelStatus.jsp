<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function validateForm() {
   
	 var parcelStatus = document.myform.parcelStatus.value;
	    if (parcelStatus == null || parcelStatus == "") {

	        alert("Please enter your parcelStatus ");
	        return false;
	    }
}
</script>
</head>
<body bgcolor="lavender">
<form name="myform" action="ParcelSUController" method="post" onSubmit="return validateForm();" >
<table>
<tr>
<td>Prr no: <input type="hidden" name="prrNo" value="${prrNo}"></td>
<td>${prrNo}</td>
</tr>
<tr>
<td>Clerk Name: <input type="hidden" name="clerkName" value="${clerkName}"></td>
<td>${clerkName}</td>
</tr>
<tr><td>Train No:<input type="hidden" name="trainNo" value="${trainNo}"></td>
<td>${trainNo}</td></tr>
<tr><td>Parcel Status:<input type="text" name="parcelStatus" value="${parcelStatus}"></td>
</table>
<input type="submit" value="Update">
</form>
</body>
</html>