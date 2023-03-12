<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="include/navigation.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Report</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	
</head>
<body>

<br/><div class="container">
<h2>Class Report</h2><br/>
	<table class="table">
		<tr>
			<th>class_id</th>
			<th>class_name</th>
			<th>class_description</th>
			<th>subject_name</th>
			<th>teacher assigned to</th>
			<th>students assigned</th>
		</tr>
		
		<c:forEach var="classReport" items="${requestScope.classreports}">
			<tr>
				<td>${classReport.class_id}</td>
				<td>${classReport.class_name}</td>
				<td>${classReport.class_description}</td>
				<td>${classReport.subject_name}</td>
				<td>${classReport.teacher_fname} ${classReport.teacher_lname} </td>
				<td>${classReport.student_fname} ${classReport.student_lname}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
<body>

</body>
</html>