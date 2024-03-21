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
	<form:form action="processForm" modelAttribute="customer">
		<form:label path="name">Customer name: </form:label>
		<br><br>
		<form:input type="text" path="name"/><br>
		<form:errors path="name" cssClass="error"/><br>
		<br>
		
		<form:label path="age">Customer age: </form:label>
		<br><br>
		<form:input type="text" path="age"/><br>
		<form:errors path="age" cssClass="error"/><br>
		
		<form:label path="zipCode">Customer zipCode: </form:label>
		<br><br>
		<form:input type="text" path="zipCode"/><br>
		<form:errors path="zipCode" cssClass="error"/><br>
		
		<input type="submit" value="submit" />
	
	</form:form>
	</div>
	
</body>
</html>