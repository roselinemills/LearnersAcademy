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
<title>Administrator dashboard</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light" >
		<div class="container-fluid">
			<a class="navbar-brand" style="margin-left: 15px;" href="#">Learner's Academy Dashboard</a>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="index.jsp">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="nav-section" style="margin-top: 20px; margin-left: 50px;">
	<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a aria-current="page" class="nav-link" href="addSubject.jsp">Set up master list of subjects</a></li>
					<li class="nav-item"><a class="nav-link" href="addTeacher.jsp">Set up master list of teachers</a></li>					
					<li class="nav-item"><a class="nav-link" href="addClass.jsp">Set up master list of classes</a></li>
					<li class="nav-item"><a class="nav-link" href="AssignClassServlet">Assign classes for subjects</a></li>	
					<li class="nav-item"><a class="nav-link" href="AssignTeacherServlet">Assign teachers to a class</a></li>						
					<li class="nav-item"><a class="nav-link" href="StudentServlet">Get a master list of students</a></li>
					<li class="nav-item"><a class="nav-link" href="ClassReportServlet">View class report</a></li>			
	</ul>
	</div>
</body>
</html>