<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="include/navigation.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Classes page</title>
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
<h2>All Classes</h2><br/>
	<table class="table">
		<tr>
			<th>Class Id</th>
			<th>Class Name</th>
			<th>Class Description</th>
			<th>Subject Assigned</th>
		</tr>
		<c:forEach var="learnerClass" items="${requestScope.classes}">
			<tr>
				<td>${learnerClass.class_id}</td>
				<td>${learnerClass.class_name}</td>
				<td>${learnerClass.class_description}</td>
				<td>${learnerClass.getSubject_name()}</td>
			</tr>
		</c:forEach>
	</table>
	</div>	
</body>
</html>