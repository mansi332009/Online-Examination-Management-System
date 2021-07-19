<%-- 
    Document   : adduser
    Created on : 11 Apr, 2021, 2:44:31 PM
    Author     : Mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Exam</title>
        <style type="text/css">
        body {
            margin:0px;
            border:0px;
        }
        .header{
            width:100%;
            height:100px;
            background-color:#a62c2b;
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
             background-color:#a62c2b;
             position: fixed;
            height: 100%;
            overflow: scroll;
          
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
form .button {
    height:100%;
    width:20%;
    outline:none;
    color:#fff;
    border:none;
    font-size:18px;
    font-weight: 500;
    letter-spacing: 1px;
    border-radius: 5PX;
    background:#a62c2b ;
}
form .button :hover{
    background:black ;
}

.button a{
    text-decoration:none;
    color: black;
    font-size: 16px;
    line-height: 20px;
    margin: 0;
    margin-left:25px;
     background-color:#a62c2b; 
}
a:hover {
    color: white;
   
}
button{
    height: 45px;
    margin:45px 0;
}
button {
    height:100%;
    width:20%;
    outline:none;
    color:#fff;
    border:none;
    font-size:18px;
    font-weight: 500;
    letter-spacing: 1px;
    border-radius: 5PX;
    background:#a62c2b ;
}
button :hover{
    background:black ;
}
    </style>
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
            <li><a href="deleteteacher.jsp"> Delete Teacher</a></li>
            <li><a href="deleteuser.jsp"> Delete Student</a></li>
            <li><a href="feedbackmanage.jsp"> Manage Feedback</a></li>
             <a type="button" onclick="myfunc()">LogOut</a>
</ul>
            </div>
            
           
        <div class="content" align="center">
            
            <form method="post" >
                <div class="user-details">
                    
                <div class="input-box">
                    <a class="details" href="addteacher.jsp"><input type="button" value="Add Teacher" name="Add Teacher"/></a>
                    <a class="details" href="addstudent.jsp"><input type="button" value="Add Student" name="Add Student"/></a>
                    
                          
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

