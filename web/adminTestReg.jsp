<%-- 
    Document   : adminTestReg
    Created on : 20 Apr, 2021, 12:23:17 PM
    Author     : Mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*,java.util.*" %>
<%Class.forName("org.apache.derby.jdbc.ClientDriver");%>

<!DOCTYPE html>
<html>
   
    <head>
        <meta charset="UTF-8">
        <title>Test Creation Form</title>
        <style type="text/css">
        body {
            margin:0px;
            border:0px;
        }
        .header{
            width:100%;
            height:100px;
           background:linear-gradient(120deg,#2980b9,#8e44ad);
            color:white;
            
        }
        #image{
            height:80px;
            background-color: white;
            border-radius: 50px;
        }
        .main-content{
            display:flex;
        }
        
        .sidebar {
            top:0;
             margin: 0;
             padding: 0;
              width: 230px;
            background:linear-gradient(120deg,#2980b9,#8e44ad);
             position: fixed;
            height: 100%;
            overflow:scroll;
          
            flex:1
        }
        
        .content{
            flex:3;
            height: 530px;
            background-color:white;
            font-size:20px;
            font-weight:900;
        }
        ul li{
            padding:20px;
            border-bottom: 2px solid grey;
            list-style-type:none;    
        }
        
        .sidebar p{
		
		font-size:40px;
		padding:16px;
		text-align:center;
		color:white;
		font-family: cursive;
                
}
.sidebar a {
  display: block;
  color: white;
  padding: 16px;
  font-size:18px;
  text-decoration: none;
  text-align:center;
  
 
}
 
.sidebar a:hover{
  color:white;
  background-color: black;
}
form{
    margin-top: 50px;
}
    form .user-details .input-box{
        margin-bottom:10px;
        width:50%;
    }
    form .gender-details .category{
        width:50%;
    }

    form .user-details .input-box{
    margin-bottom:15px;
    width:40%;    
}
.user-details .input-box .details{
    font-weight:500;
    margin-bottom:5px;
    display:block;
}
.user-details .input-box input{
    height:45px;
    width:50%;
    outline:none;
    border-radius: 5px;
    border:1px solid #ccc;
    padding-left:15px;
    font-size:16px;
    border-bottom-width:2px;
    transition: all 0.3s ease;
}
.user-details .input-box input:focus,.user-details .input-box input:valid{
    border-color:#9b59b5;
}

form input[type="radio"]{
    display:none;
}
form .button{
    height: 45px;
    margin:45px 0;
}
form .button input{
    height:100%;
    width:20%;
    outline:none;
    color:#fff;
    border:none;
    font-size:18px;
    font-weight: 500;
    letter-spacing: 1px;
    border-radius: 5PX;
    background:linear-gradient(120deg,#2980b9,#8e44ad);;
}
form .button input:hover{
    background:black ;
}
a{
    text-decoration:none;
    color: black;
    font-size: 16px;
    line-height: 20px;
    margin: 0;
    margin-left:25px;
}
a:hover {
    color: white;
}
    </style>
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
    <body>   
        <div class="header">
            <center><img src="59.png" alt="adminicon" id="image"></center>
            
        </div>
        
            <div class="main-content">
            <div class="sidebar">
                <p>ONLINE</br>EXAM</p>
                <ul>
           <li><a href="adminTestReg.jsp">Create Exam</a></li>
             <li><a href="viewexam.jsp">View Exam</a></li>
            <li><a href="result_admin.jsp">Result</a></li>
            <li><a href="adduser.jsp"> Add user</a></li>
            <li><a href="studentdetail.html">View Student Detail</a></li>
            <li><a href="teacherdetail.html">View Teacher Detail</a></li>
            <li><a href="deleteuser.jsp"> Delete Student</a></li>
            <li><a href="deleteteacher.jsp"> Delete Teacher</a></li>
            
            <li><a href="feedbackmanage.jsp"> Manage Feedback</a></li>
             <a type="button" onclick="myfunc()">LogOut</a>
             
</ul>
            </div>
            
           
        <div class="content" align="center">
            
            <form action="adminTestServlet" method="post" >
         
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">Test Name
                        <input type="text" placeholder=" Enter Test name" name="test_name" required></span>            
                </div>
             
                <div class="input-box">
                        <span class="details">Total Marks
                        <input type="number" placeholder=" Enter Total Marks" name="total_marks" required></span>            
                </div>
               <div class="input-box">
                        <span class="details">Test ID
                        <input type="number" placeholder=" Enter Test ID"  name="test_id" required></span>    
                </div>
                        
        <div id="clock"> 
        
        <div class="input-box">
          <span class="details">minutes
              <input id="min" type="text" placeholder=" Enter Minutes " name="test_min"></span>
        </div>
              <div class="input-box">
        <span class="details">Seconds
            <input id="sec" type="text" placeholder=" Enter Minutes " name="test_sec"> </span>
            <p id="msg"></p>
      </div>
      </div> 
        <div class="button">
            <input type="submit"  value="Create">
            <a href="adminExamReg.jsp"></a>
        </div>
        </div>
            </form>
           </div> 
            </div>
            
            
        <script type="text/javascript">
                function myfunc(){
                      if(window.confirm("Forwarding to Home page")===true)
                          window.location.replace("index.html");
                         
                     
                         
                    }
                   </script> 
    </body>
</html>
