<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="pet">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<!-- <tr>
				<td>Species-v1:</td>
				<td><form:select path="species">
				<form:option value="cat">Cat</form:option>
				<form:option value="dog">Dog</form:option>
				<form:option value="rabbit">Rabbit</form:option>
				<form:option value="bird">Bird</form:option>
				</form:select></td>
			</tr> -->
			
			<tr>
				<td>Species-v2</td>
				<td><form:select path="species">
					<form:options items="${speciesList}"></form:options>
				</form:select></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobuttons path="gender" items="${genderList}"/>
					
				</td>
			</tr>
			<tr>
				<td>How did you hear about us:</td>
				<td><form:checkboxes path="sources" items="${sourceList}"/>
					
				</td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>