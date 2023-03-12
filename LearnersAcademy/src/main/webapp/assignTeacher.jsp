<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@include file="include/navigation.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign teacher to class</title>
</head>
<body>
<br/>
<div class="container" style ="margin-top: 20px; margin-left: 50px;">
<h2 class="header">Assign teacher to class</h2><br/>
	<form action="TeacherClassServlet" method="POST">
                     <span class="card-title">Select teacher name</span>
					<select name= "teacher">
					<c:forEach var="teacher" items="${requestScope.teachers}">
						<option value= "${teacher.teacher_id}"> ${teacher.first_name} ${teacher.last_name}</option>
						</c:forEach>
					</select>
					<span class="card-title">Select class name</span>
					<select name= "class">
					<c:forEach var="learnerClass" items="${requestScope.classes}">
						<option value= "${learnerClass.class_id}"> ${learnerClass.class_name}</option>
					</c:forEach>
					</select>
					<div class="card-action"><br/>
			             <input type="submit" class="fadeIn fourth" value="Submit" /></div>			        
        </form>
	</div>
</body>
</html>