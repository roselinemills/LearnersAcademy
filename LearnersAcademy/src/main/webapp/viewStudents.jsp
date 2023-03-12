<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@page import="entity.Student"%>
    <%@include file="include/navigation.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student's page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
<br/>
<div class="container">
<h2>All Students</h2><br/>
	<table class="table">
		<tr>
			<th>student_id</th>
			<th>first_name</th>
			<th>last_name</th>
			<th>phone_number</th>
			<th>email</th>
			<th>class</th>
		</tr>
		
		<c:forEach var="student" items="${requestScope.students}">
			<tr>
				<td>${student.student_id}</td>
				<td>${student.first_name}</td>
				<td>${student.last_name}</td>
				<td>${student.phone_number}</td>
				<td>${student.email}</td>
				<td>${student.learner_class}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>