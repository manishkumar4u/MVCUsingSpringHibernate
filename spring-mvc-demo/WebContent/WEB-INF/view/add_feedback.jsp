<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Website</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Add Feedback</h2>
			<h5>Teaching Code: ONLINE- Online Course     YOUTUBE- Youtube Videos     LECTURE- Guest Lecture</h5>
		</div>
	</div>
	<div id="container">
		<form:form action="showFeedbackAdd" modelAttribute="feedback"
			method="POST">
			<table>
				<tbody>
					<tr>
						<td><label>Name:</label></td>
						<td><form:input path="feedBackName" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="feedBackEmail" /></td>
					</tr>
					<tr>
						<td><label>Message:</label></td>
						<td><form:input path="feedBackNarrative" /></td>
					</tr>
					<tr>
						<td><label>Teaching Type:</label></td>

						<td><form:input path="teachingTypeCode" /></td>
					</tr>
					<tr>
						<td><label>Rating:</label></td>
						<td><form:input path="feedBackRating" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
</body>
</html>