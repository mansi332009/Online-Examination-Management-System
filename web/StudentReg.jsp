<%-- 
    Document   : newjsp12
    Created on : May 10, 2021, 5:05:51 PM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registration Form</title>
        <link href="three.css" rel="stylesheet" type="text/css"/> 
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
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
            <div class="title">Student Registration</div>
        <form id="form" action="RegisterServlet"  onsubmit= "return validate()">
            <div class="user-details">
                    <div class="input-box">
                        <span class="details">Full Name</span>
                        <input type="text" placeholder=" Enter Your name" name="sname" id='full-name' required pattern="^[a-zA-Z]+(?:\s[a-zA-Z]+)+$"/><span id=m7></span>         
                    </div>
             
                <div class="input-box">
                        <span class="details">Username</span>
                        <input type="text" id="txtUsername"placeholder=" Enter Your user name" name="uname" required>            
                </div>
                <div class="input-box">
                        <span class="details">Email</span>
                        <input type="email"  name="email"  placeholder="Enter your Email" required >    
                </div>
                    <div class="input-box">
                        <span class="details">Smart Id</span>
                        <input type="text" placeholder=" Enter Your ID" name="id" id='user-id' required pattern="^[A-Za-z0-9_]{10}"/><span id=m1></span>        
                </div>
                    <div class="input-box">
                        <span class="details">Roll no</span>
                        <input type="number"  id="roll-user" placeholder=" Enter Your Rollno" name="rno"  required pattern="^[1-9][0-9]{9}$"/><span id=m8></span>              
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
            
             <input  type="submit"    class="pure-button pure-button-primary" value ="Register"/>
            <a href="Login.jsp">Already have Account?</a>
        </div>
        </form>
            <div id="message">
  <h3>Password must contain the following:</h3>
  <p id="letter" class="invalid">A <b>lowercase</b> letter</p>
  <p id="capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
  <p id="number" class="invalid">A <b>number</b></p>
  
  <p id="length" class="invalid">Minimum <b>8 characters</b></p>
</div>
    </body>
</html>
