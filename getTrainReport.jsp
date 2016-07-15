<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lavender">
 <h1>Report of a train</h1>
        <table border="1">
            <tr><th>Prr no</th>
                <th>Clerk Name</th>
                <th>Date</th>
                <th>Train No</th>
                <th>Source </th>
                <th>Destination </th>
                <th>Item type</th>
                <th>Item quantity</th>
                <th>Weight</th>
                <th>Distance</th>
                <th>Price</th>
                <th>Sender name</th>
                <th>Sender mobile</th>
                <th>Sender address</th>
                <th>Recipient name</th>
                <th>Recipient  mobile</th>
                <th>Recipient address</th>
                
            </tr>
            <c:forEach var="report" items="${requestScope.report}">
                <tr><td>${report.prrNo}</td>
                    <td>${report.clerkName}</td>
                    <td>${report.date}</td>
                    <td>${report.trainNo}</td>
                    <td>${report.sourceStationName}</td>
                    <td>${report.destinationStationName}</td>
                    <td>${report.itemType}</td>
                    <td>${report.itemQuantity}</td>
                    <td>${report.weight}</td>
                    <td>${report.distance}</td>
                    <td>${report.price}</td>
                    <td>${report.senderName}</td>
                    <td>${report.senderMobile}</td>
                    <td>${report.senderAddress}</td>
                    <td>${report.recipientAddress}</td>
                    <td>${report.recipientMobile}</td>
                    <td>${report.recipientName}</td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>