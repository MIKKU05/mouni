<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lavender">
<form action="ParcelSIController" method="post">
<table>
<tr>
<td><h4>Prr no:</h4> <input type="hidden" name="prrNo" value="${prrNo}"></td>
<td>${prrNo}</td>
</tr>
<tr>
<td><h4>Clerk Name:</h4> <input type="hidden" name="clerkName" value="${clerkName}"></td>
<td>${clerkName}</td>
</tr>
<tr>
<td><h4>Date:</h4><input type="hidden" name="date" value="${date}"></td>
<td>${date}</td>
</tr>
<tr><td><h4>Train No:</h4><input type="hidden" name="trainNo" value="${trainNo}"></td>
<td>${trainNo}</td></tr>

<tr>
<td><h4>Source station name:</h4><input type="hidden" name="sourceStatioName" value="${sourceStatioName}"></td>
<td> ${sourceStatioName}</td>
<td><h4>Destination station name:</h4> <input type="hidden" name="destinationStationName" value="${destinationStationName}"></td>
<td>${destinationStationName}</td>
</tr>
<tr><td><h4>Item type: </h4><input type="hidden" name="itemType" value="${itemType}"></td>
<td>${itemType}</td></tr>
<tr><td><h4>Item quantity :</h4><input type="hidden" name="itemQuantity" value="${itemQuantity}"></td>
<td>${itemQuantity}</td></tr>
<tr><td><h4>Weight :</h4><input type="hidden" name="weight" value="${weight}"></td>
<td> ${weight}</td></tr>
<tr>
<td><h4>Distance: </h4><input type="hidden" name="distance" value="${distance}"></td>
<td>${distance}</td>
<td><h4>Price: </h4><input type="hidden" name="price" value="${price}"></td>
<td>${price}</td>
</tr>
<tr>
<td><h4>Sender name:</h4><input type="hidden" name="senderName" value="${senderName}"></td>
<td>${senderName}</td>
<td><h4>Sender mobile : </h4><input type="hidden" name="senderMobile" value="${senderMobile}"></td>
<td>${senderMobile}</td>
</tr>
<tr><td><h4>Sender address: </h4><input type="hidden" name="senderAddress" value="${senderAddress}"></td>
<td>${senderAddress}</td></tr>
<tr>
<td><h4>Recipient name:</h4><input type="hidden" name="recipientName" value="${recipientName}"></td>
<td>${recipientName}</td>
<td><h4>Recipient  mobile :</h4><input type="hidden" name="recipientMobile" value=" ${recipientMobile}"></td>
<td> ${recipientMobile}</td>
</tr>

<tr>
<td><h4>Recipient address:</h4><input type="hidden" name="recipientAddress" value="${recipientAddress}"></td>
<td> ${recipientAddress}</td>
</tr>

</table>
<input type="submit" value="Print ">
</form>
</body>
</html>