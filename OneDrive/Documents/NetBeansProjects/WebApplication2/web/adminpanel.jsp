<%-- 
    Document   : adminpanel
    Created on : Apr 12, 2021, 4:08:47 PM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin panel</title>
    </head>
    
        
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
    </style>
    
    <body>
    
        <div class="header">
            <center><img src="59.png" alt="adminicon" id="image"></center>
            
        </div>
        <div class="main-content">
            <div class="sidebar">
                <p>EXAM</br>ONLINE</p>
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
            <li><a href="contactmanage.jsp"> Manage Feedback</a></li>
             <a type="button" onclick="myfunc()">LogOut</a>
</ul>
            </div>
            <div class="content">
                <center> <h3>Hello Admin!</h3></center>
            </div>
        </div>
    </body>
    <script type="text/javascript">
                function myfunc(){
                      if(window.confirm("Forwarding to Home page")===true)
                          window.location.replace("index.html");
                         
                     
                         
                    }
                    //INSERT INTO app."ADMIN" VALUES ('mansi saxena','mansi1234','1234');
                   </script>
                   
</html>
