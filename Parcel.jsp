<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function validateForm() {
   
	 var clerkName = document.myform.clerkName.value;
	    if (clerkName == null || clerkName == "") {

	        alert("Please enter your clerkName ");
	        return false;
	    }

	    
	    var date = document.myform.date.value;
	    if (date == null || date == "") {

	        alert("Please enter your date ");
	        return false;
	    }

	
	var trainNo = document.myform.trainNo.value;
    if (trainNo == null || trainNo == "") {

        alert("Please enter your Train no.");
        return false;
    }

var sourceStationName = document.myform.sourceStationName.value;
    if (sourceStationName == null || sourceStationName == "") {

        alert("Please enter Source station name.");
        return false;
    }
    var destinationStationName = document.myform.destinationStationName.value;
    if (destinationStationName == null || destinationStationName == "") {

        alert("Please enter Destination station name.");
       return false;
    }
    
    var itemType = document.myform.itemType.value;
    if (itemType == null || itemType == "") {

        alert("Please enter Item type.");
       return false;
    }
    
    var itemQuantity = document.myform.itemQuantity.value;
    if (itemQuantity == null || itemQuantity == "") {

        alert("Please enter itemQuantity");
       return false;
    }

var weight = document.myform.weight.value;
if (weight == null || weight == "") {

    alert("Please enter weight.");
   return false;
}


var distance = document.myform.distance.value;
if (distance == null || distance == "") {

    alert("Please enter Distance.");
   return false;
}

var price= document.myform.price.value;
if (price == null || price == "") {

    alert("Please enter Price.");
   return false;
}

var senderName= document.myform.senderName.value;
    if (senderName == null || senderName == "") {

        alert("Please enter Sender name.");
        return false;
    }
    
    var senderMobile = document.myform.senderMobile.value;
    if (senderMobile == null || senderMobile == "") {

        alert("Please enter Sender mobile .");
       return false;
    }
    
var senderAddress = document.myform.senderAddress.value;
    if (senderAddress == null || senderAddress == "") {

        alert("Please enter Sender address.");
       return false;
    }

var recipientName = document.myform.recipientName.value;
    if (recipientName == null || recipientName == "") {

        alert("Please enter Recipient name.");
       return false;
    }
var recipientMobile = document.myform.recipientMobile.value;
    if (recipientMobile == null || recipientMobile == "") {

        alert("Please enter Recipient Mobile.");
       return false;
    }
var recipientAddress = document.myform.recipientAddress.value;
    if (recipientAddress == null || recipientAddress == "") {

        alert("Please enter Recipient address.");
       return false;
    }





}
</script>
</head>
<body>
<center> Parcel details
</center>
<form name="myform" method="post" action="ParcelController" onSubmit="return validateForm();"   >
<table>
<tr>
<td>Clerk Name: <input type="text" name="clerkName" > </td>
</tr>
<tr>
<td>Date: <input type="text" name="date"></td>
</tr>
<tr><td>Train No.: <input type="text" name="trainNo" ></td></tr>

<tr>
<td>Source station name: <input type="text" name="sourceStationName"></td>
<td>Destination station name: <input type="text" name="destinationStationName" ></td>
</tr>
<tr><td>Item type: <input type="text" name="itemType" ></td>
<td>Item quantity : <input type="text" name="itemQuantity" ></td></tr>
<tr><td>Weight : <input type="text" name="weight" ></td>
<td>Distance: <input type="text" name="distance" ></td>
</tr>
<tr>
<td>Price: <input type="text" name="price" ></td>
</tr>
<tr>
<td>Sender name: <input type="text" name="senderName" ></td>
<td>Sender mobile : <input type="text" name="senderMobile" ></td>
</tr>
<tr><td>Sender address: <input type="text" name="senderAddress" ></td></tr>
<tr>
<td>Recipient name: <input type="text" name="recipientName"></td>
<td>Recipient  mobile : <input type="text" name="recipientMobile" ></td>
</tr>

<tr>
<td>Recipient address: <input type="text" name="recipientAddress" ></td>
</tr>

</table>
<input type="submit" value="submit ">
</form>
</body>
</html>