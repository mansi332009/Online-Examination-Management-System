<%-- 
    Document   : student_aftr_login
    Created on : 12 Apr, 2021, 8:46:50 AM
    Author     : Mansi
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type = "text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
    </script>
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
  background-color: green;
}
    </style>
    
</head>
<body>
    <%
   // response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  // response.setHeader("Expires","0");
  // response.setHeader("Progma","no-cache");
    %>
 <div class="header">
            <center><img src="48.png" alt="studenticon" id="image"></center>
</div>
 <div class="main-content">   
<div class="sidebar">
	<p>EXAM</br>ONLINE</p>
        <ul>
        <li> <a href="profile_project.jsp?st_id=<%=request.getParameter("st_id")%>">Profile</a></li>
        <li><a href="./exam_project.jsp?st_id=<%=request.getParameter("st_id")%>">Exam</a></li>
        <li><a href="result_student.jsp?st_id=<%=request.getParameter("st_id")%>">Result</a></li>
        <li><a href="Feedback.jsp?st_id=<%=request.getParameter("st_id")%>">Feedback</a></li>
        <li><a href="logout.jsp">LogOut</a></li>
        </ul>
</div>

<div class="content">
  <center> <h3>HELLO STUDENT!</h3></center>
</div>
 </div>
        
</body>
</html>
