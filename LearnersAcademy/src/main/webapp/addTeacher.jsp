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
        <h2 class="header">Add a teacher to teacher list</h2>
                   <div class="card-stacked">
                <form action="AddTeacherServlet" method="POST">
                        <span class="card-title" style="margin-right:35px;">First name</span>
                        <input type="text" name="firstname" placeholder="firstname"/><br/><br/>
                        <span class="card-title" style="margin-right:35px;">Last name</span>
                        <input type="text" name="lastname" placeholder="lastname"/><br/><br/>
                        <span class="card-title" style="margin-right:70px;">Email</span>
                        <input type="text" name="email" placeholder="email"/><br/><br/>
                        <span class="card-title ">Phone Number</span>
                        <input type="text" name="phonenumber" placeholder="phone number"/><br/><br/>
                    <div class="card-action"><br/>
                    <input type="submit" class="fadeIn fourth" value="Submit" />
                    <input type ="hidden" name = "action" value="action1" />
                 </div>
                </form>
            </div>
    </div>
</body>
</html>