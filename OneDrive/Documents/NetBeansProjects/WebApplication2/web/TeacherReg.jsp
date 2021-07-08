<%-- 
    Document   : TeacherReg
    Created on : Apr 12, 2021, 4:05:02 PM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <html>
    <head>
        <meta charset="UTF-8">
        <title>Registration Form</title>
        <link href="four.css" rel="stylesheet" type="text/css"/> 
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
            <div class="title">  Customer Registration</div>
            <form id="form" action="TeacherServlet" method="post" onsubmit= "return validate()">
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">Full Name</span>
                        <input type="text" placeholder=" Enter Your name" name="Tsname" id='full-name' required pattern="^[a-zA-Z]+(?:\s[a-zA-Z]+)+$"/><span id=m7></span>            
                </div>
             
                <div class="input-box">
                        <span class="details">Username</span>
                        <input type="text" placeholder=" Enter Your user name" name="Tuname" required>            
                </div>
                <div class="input-box">
                        <span class="details">Email</span>
                        <input type="email" placeholder=" Enter Your email" name="Temail" required>    
                </div>
                     <div class="input-box">
                        <span class="details">Id</span>
                        <input type="text" placeholder="Enter Your Smart ID" name="Tid" id='teacher-id' required pattern="^[A-Za-z0-9_]{5}"/><span id=m10></span>
                </div>
                    <div class="input-box">
                        <span class="details">Department</span>
                        <input type="text" placeholder=" Enter Your Department" name="dept" required> 
                </div>
                <div class="input-box">
                <span class="details">password</span>
            <input type="password" id="pass" name="Tpassword" placeholder="Enter your Password"><div id="f2"></div>
            </div>
            <div class="input-box">
                <span class="details"> Confirm password</span>
            <input type="password" id="cpass" name="Tcpassword" placeholder="Enter Confirm  Password"><div id="f3"></div>
            </div>
                </div>       
        
        <div class="button">
            
             <input  type="submit"  value ="Register"/>
            <a href="login.jsp">Already have Account?</a>
        </div>
       
            </form>   
        <div id="message">
  <h3>Password must contain the following:</h3>
  <p id="letter" class="invalid">A <b>lowercase</b> letter</p>
  <p id="capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
  <p id="number" class="invalid">A <b>number</b></p>
  <p id="number" class="invalid">A <b>n</b></p>
  <p id="length" class="invalid">Minimum <b>8 characters</b></p>
</div>
        </div>
    </body>
</html>

