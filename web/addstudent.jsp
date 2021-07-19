<%-- 
    Document   : addstudent
    Created on : 11 Apr, 2021, 2:51:43 PM
    Author     : Mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*,java.util.*" %>
<%Class.forName("org.apache.derby.jdbc.ClientDriver");%>

<!DOCTYPE html>
<html>
   
    <head>
        <meta charset="UTF-8">
        <title>Add Student Form</title>
        <link href="three.css" rel="stylesheet" type="text/css"/> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="namecheck.js"></script>
                <script>
            function validate(){
                
				
				var Pass=document.getElementById("pass").value;
				var CPass=document.getElementById("cpass").value;
				
				if(Pass == ""){
					document.getElementById("f2").innerHTML="Please enter your password." ;
					return false;
				}
                                
				if(Pass.length<8){
					document.getElementById("f2").innerHTML="Password must be of at least 8 characters long." ;
					return false;
				}
				if(Pass.search(/[a-z]/) == -1){
					document.getElementById("f2").innerHTML="There must be at least 1 lowercase character." ;
					return false;
				}
				if(Pass.search(/[A-Z]/) == -1){
					document.getElementById("f2").innerHTML="There must be  at least 1 uppercase character." ;
					return false;
				}
				if(Pass.search(/[0-9]/) == -1){
					document.getElementById("f2").innerHTML="There must be at least 1 number ." ;
					return false;
				}
				else{
					document.getElementById("f2").innerHTML="";
				}
                               if(CPass == ""){
					document.getElementById("f3").innerHTML="Please enter your Confirm password." ;
					return false;
				}
				if(CPass!=Pass){
					document.getElementById("f3").innerHTML="Password not matched!! Please re-enter your correct password.";
					return false;
				}
				else{
					document.getElementById("f3").innerHTML="";
				}
				return true;
			}
        </script>

    </head>
    <body>
        <div class="container">
            <div class="title"> Add Student</div>
            <form id="form" action="addstudentServlet" method="post" onsubmit= "return validate()">
                
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">Full Name</span>
                        <input type="text" placeholder=" Enter Your name" name="sname"  id='full-name' required pattern="^[a-zA-Z]+(?:\s[a-zA-Z]+)+$"/><span id=m7></span>                       
                </div>
             
                <div class="input-box">
                        <span class="details">Username</span>
                        <input type="text" placeholder=" Enter Your user name" name="uname" required>            
                </div>
                <div class="input-box">
                        <span class="details">Email</span>
                        <input type="email" placeholder=" Enter Your email" name="email" required>    
                </div>
                    <div class="input-box">
                        <span class="details">Smart Id</span>
                        <input type="text" placeholder=" Enter Your ID" name="id" required>            
                </div>
                    <div class="input-box">
                        <span class="details">Roll no</span>
                        <input type="number" placeholder=" Enter Your Rollno" name="rno" required>            
                </div>
                   <div class="input-box">
                        <span class="details">Course</span>
                        <input type="text" placeholder="Course" name="course" required>            
                </div>  
                 <div class="input-box">
                <span class="details">password</span>
            <input type="password" id="pass" name="password" placeholder="Enter your Password"><div id="f2"></div>
            </div>
            <div class="input-box">
                <span class="details"> Confirm password</span>
            <input type="password" id="cpass" name="cpassword" placeholder="Enter Confirm  Password"><div id="f3"></div>
            </div>
            </div>
            
        
        <div class="button">
            <input type="submit"  value="Add">
        </div>
        
        </form>
        </div>
    </body>
</html>


