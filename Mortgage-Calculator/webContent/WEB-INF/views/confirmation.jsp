<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monthly Amortization Schedule</title>
<style type="text/css">
.error{
	color : red
}
table, th, td {
  border: 1px solid black;
}
</style>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">

</head>
<body>
	<h1>Monthly Amortization Schedule</h1>
	<b>Monthly Payment : ${loan.getMonthlyPayment() }</b>
	
	
	<table>
		<tr>
			<th>Payment No.</th>
			<th>Principal Paid</th>
			<th>Interest Paid</th>
			<th>Outstanding Balance</th>
		</tr>
		<c:forEach var="payment" begin ="1" end="${loan.getLoanTerm() }">
			<tr>
				<td>${payment}</td>
				<td></td>
				<td></td>
				<td>${loan.getLoanBalance()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>