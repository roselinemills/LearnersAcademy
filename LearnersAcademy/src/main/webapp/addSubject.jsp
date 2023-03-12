<%@page import="database.LearnerSubjectDB"%>
<%@page import="entity.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="include/navigation.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container" style ="margin-top: 20px; margin-left: 50px;">
        <h2 class="header">Add a Subject to master list</h2>
               <div class="card-stacked">
	                <form action="AddSubjectServlet" method="POST">
	                     <span class="card-title">Subject name</span>
	                        <input type="text" name="Subjectname" placeholder="subject name"/><br/><br/>
					<div class="card-action"><br/>
	                    <input type="submit" class="fadeIn fourth" value="Submit" />
	                 </div>
	                </form>
        		</div>
    </div>
</body>
</html>