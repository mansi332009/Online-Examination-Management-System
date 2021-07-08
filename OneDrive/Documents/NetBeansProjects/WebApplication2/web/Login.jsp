<%-- 
    Document   : Login
    Created on : Mar 10, 2021, 4:27:59 PM
    Author     : Mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset=UTF-8">
        <link href="one.css" type="text/css" rel="stylesheet">
        
        <title>Login</title>
</head>
    <div class="center">
        
        <h1>Log In</h1>
	<form action="LoginServlet" method="post">
            <div class="txt_field">
                <input type="text" name="uname" required >
                <span></span>
                <label align="center">Username</label>
            </div>
            <div class="txt_field" >
	<input type="password"  name="password" required >
        <span></span>
        <label>Password</label>
            </div>
            <input type="submit" value="Login">	
            <div class="signup_link">
                Not a member?<a href="RegCheack.jsp">SignUp</a>
            </div>
    </div>
    </form>
</body>
</html>



