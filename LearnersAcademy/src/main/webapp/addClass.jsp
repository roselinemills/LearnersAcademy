<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="include/navigation.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Class</title>
</head>
<body>
<div class="container" style ="margin-top: 20px; margin-left: 50px;">
        <h2 class="header">Add a class to master class list</h2>
                   <div class="card-stacked">
                <form action="AddClassServlet" method="POST">
                        <span class="card-title" style="margin-right:40px;">Class name</span>
                        <input type="text" name="classname" placeholder="class name"/><br/><br/>
                        <span class="card-title">Class Description</span>
                        <input type="text" name="description" placeholder="class description"/><br/><br/>
                    <div class="card-action"><br/>
                    <input type="submit" class="fadeIn fourth" value="Submit"/>
                 </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>