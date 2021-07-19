<%-- 
    Document   : TeacherWelcome
    Created on : 12 Apr, 2021, 4:31:11 PM
    Author     : Mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teacher panel</title>
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
            overflow: hidden;
          
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
  background-color: green;
}
    </style>
    <body>
        <div class="header">
            <center><img src="teacher2.jpg" alt="Teachericon" id="image"></center>
            
        </div>
         <div class="main-content">
            <div class="sidebar">
                <p>ONLINE</br>EXAM</p>
                <ul>
         <li><a href="TestReg.jsp?teacher_id=<%=request.getParameter("teacher_id")%>">Create Exam</a></li>
            <li><a href="result_teacher.jsp?teacher_id=<%=request.getParameter("teacher_id")%>">View Result</a></li>
            <li><a href="studentdetail_teacher.jsp?teacher_id=<%=request.getParameter("teacher_id")%>">View Student Detail</a></li>
            <li><a href="teacher_profile.jsp?teacher_id=<%=request.getParameter("teacher_id")%>"> Edit Profile</a></li>
             <li><a type="button" onclick="myfunc()">LogOut</a></li>
             
</ul>
            </div>
            <div class="content">
                <center> <h3>Hello Teacher!<br> WELCOME TO ONLINE EXAM</h3></center>
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


