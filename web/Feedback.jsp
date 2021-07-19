<%-- 
    Document   : Feedback
    Created on : Apr 12, 2021, 3:57:27 PM
    Author     : mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Feedback Form</title>
        <link href="five.css" rel="stylesheet" type="text/css"/> 
         <script src="namecheck.js"></script>
    <style>
  .button_style {
    display: block;
    width: 110px;
    height: 25px;
    background: #4E9CAF;
    padding: 10px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
    line-height: 25px;
    margin-top: 5px;
    margin-left:30px;
}


</style>      
</head>
    
    <body>
        <a class="button_style" href="student_aftr_login.jsp?st_id=<%=request.getParameter("st_id")%>">Menu Page</a> 
        <div class="container">
            
            <div class="title">Send Us your Feedback</div>
            <form action="feedbackservlet" method="post">
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">Full Name</span>
                        <input type="text" placeholder=" Enter Your name" name="SNAME" id='full-name' required pattern="^[a-zA-Z]+(?:\s[a-zA-Z]+)+$"/><span id=m7></span>                 
                </div>
                    
                <div class="input-box">
                        <span class="details">Email</span>
                        <input type="email" placeholder=" Enter Your email" name="EMAIL" required>    
                </div> 
               
                
                     <div class="experience-details">
            <input type="radio" name="EXPERIENCE"  value="Good" id="dot-3">
            <input type="radio" name="EXPERIENCE"  value="Average" id="dot-4">
            <input type="radio" name="EXPERIENCE" value="Bad" id="dot-5">
            <span class="experience-title">How do you rate your overall experience?</span>
            <div class="experience-category">
                <label for="dot-3">
                    <span class="dot three"></span>
                    <span class="experience">Good</span>
                </label>
                <label for="dot-4">
                    <span class="dot four"></span>
                    <span class="experience">Average</span>
                </label>
                <label for="dot-5">
                    <span class="dot five"></span>
                    <span class="experience">Bad</span>
                </label>
        </div>
        </div>   
                    <div class="service-details">
            <input type="radio" name="SATISFY"  value="Yes" id="dot-1">
            <input type="radio" name="SATISFY"  value="No" id="dot-2">
            <span class="service-title">Did you satisfy with our services?</span>
            <div class="service-category">
                <label for="dot-1">
                    <span class="dot one"></span>
                    <span class="satisfy">Yes</span>
                </label>
                <label for="dot-2">
                    <span class="dot two"></span>
                    <span class="satisfy">No</span>
                </label>
        </div>
        </div>   
                    
                    <div class="input-box">
                        <span class="details">Message</span>
                        <textArea name ="SUGGESTION" placeholder="YOUR SUGGESTIONS" style=" height:150px;"></textArea>
                    </div>
                    <div class="input-box">
                        <span class="details">ID</span>
                        <input type="text" placeholder=" Enter Your ID" name="ID" required>            
                </div>
        </div>
                
                    <div class="button">
            <input  type="submit"  value ="Submit" onclick="validate()" />
        </div>
                </div>
            </form>
    </body>
</html>

