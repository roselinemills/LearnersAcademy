<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<style>
</style>
<title>Learner's Academy</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light" >
		<div class="container-fluid">
			<a class="navbar-brand" style="margin-left: 15px;" href="dashboard.jsp">Learner's Academy</a>
			<!--<div class="collapse navbar-collapse" id="navbarSupportedContent">  -->
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Logout</a></li>
				</ul>
				<ul class="navbar-nav">
					<li><a class="nav-link active"
						href="addSubject.jsp">Add Subject</a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="addTeacher.jsp">Add Teacher | </a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="addClass.jsp">Add Class | </a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="AssignClassServlet">Assign Class |</a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="AssignTeacherServlet">Assign Teacher |</a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="StudentServlet">Get Student |</a></li>
				</ul>
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ClassReportServlet">Class Report</a></li>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>