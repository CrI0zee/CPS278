<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info form</title>
<style type="text/css">
.error{
	color : red
}
</style>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/myStyle.css">
</head>
<body>
	<div class="form-style-6">
		<form:form action="processForm" modelAttribute="loan">
			<form:label path="principal">Principal: </form:label>
			<br><br>
			<form:input type="number" path="principal"/><br>
			<form:errors path="principal" cssClass="error"/><br>
			<br>
		
			<form:label path="downPayment">Down Payment: </form:label>
			<br><br>
			<form:input type="number" path="downPayment"/><br>
			<form:errors path="downPayment" cssClass="error"/><br>
			
			<form:label path="interest">Interest: </form:label>
			<br><br>
			<form:input type="text"  path="interest"/><br>
			
			<form:errors path="interest" /><br>
			
			<form:label path="loanTerm">Loan Term: </form:label>
			<br><br>
			<form:input type="number"  path="loanTerm"/><br>
			<form:errors path="loanTerm" cssClass="error"/><br>
			
			<input type="submit" value="submit" />
		</form:form>
	</div>
	
</body>
</html>