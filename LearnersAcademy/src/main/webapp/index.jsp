<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <div class="col s12 m7">
        <h2 class="header">Learner's Academy School System</h2>
        <div class="card horizontal">
            <div class="card-image">
                <img src=learning_unsplash.jpg  width="400"  height="300" />  
            </div>
            <div class="card-stacked">
                <form action="AdminLoginServlet" method="POST">
                        <span class="card-title">Username</span>
                        <input type="text" name="username" placeholder="username" value="rose"/><br/><br/>
                        <span class="card-title ">Password</span>
                        <input type="password" name="password" placeholder="password" value="rose123"/><br/>
                    <div class="card-action">
                    <input type="submit" class="fadeIn fourth" value="Log In" />
                 </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>