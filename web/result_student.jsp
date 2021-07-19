<%-- 
    Document   : resultstudent
    Created on : 12 Apr, 2021, 8:45:12 AM
    Author     : Mansi
--%>

<%@page import="java.sql.*"%>
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
<style>
body {
  margin: 0;
  font-family: "Lato", sans-serif;
}

.sidebar {
  margin: 0;
  padding: 0;
  width: 230px;
  background-color:#a62c2b;
  position: fixed;
  height: 100%;
  overflow: auto;
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
  color:green;
  background-color: #32527b;
}

div.content {
  
  padding: 1px 16px;
  
}
.sidebar p{
		
		font-size:40px;
		padding:16px;
		text-align:center;
		color:white;
		font-family: cursive;
}

tr, td {
  padding: 15px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}
tr:nth-child(even) {background-color: #aaa9ad;}

tr:hover{background-color:#D3D3D3;}
.header{
background-color: #32527b ;
  color: white;
}
.header:hover{background-color: #32527b ;}
.button {
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
    margin-left:1095px;
}
</style>
</head>
<body>
    <a class="button" href="student_aftr_login.jsp?st_id=<%=request.getParameter("st_id")%>">Menu Page</a> 
<div class="sidebar">
	<p>EXAM</br>ONLINE</p>
  <a href="#profile_project">Profile</a>
  <a href="./exam_project.jsp">Exam</a>
  <a href="result_student.jsp?st_id=<%=request.getParameter("std")%>">Result</a>
  
</div>

<div class="content">
    <center>
        <table style="margin-top: 150px;">
            <tr class="header">
                 <td>TEST ID</td>
                <td>OBTAINED MARKS</td>
            </tr>
        <%
               Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        st=conn.createStatement();
                        
                        String qry="select * from result";
                        rs=st.executeQuery(qry);
                        while(rs.next())
                        {
                            if(rs.getString(1).equals(request.getParameter("st_id").toString()))
                            {
                                %>
                                <tr>
                                    <td><%=rs.getString(2)%></td>
                                    <td><%=rs.getString(3)%></td>
                                </tr>
                                <%
                            }
                        }
               }catch(Exception e){}
                %>
        </table>
   </center>
</div>
</body>
</html>

