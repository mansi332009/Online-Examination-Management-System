<%-- 
    Document   : result_admin
    Created on : Apr 12, 2021, 9:38:03 PM
    Author     : Dell
--%>

<%@page import="java.sql.*"%>
<html>
    <head>
        <title>
result Search
</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
       <style>
           .container{
    max-width:900px;
    width:100%;
    
    margin-left: 300;
    background: #fff;
    padding:25px 30px;
    border-radius: 5px;
    margin-top:50px;
}
.container .center{
 
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: none;
}
.container .title h1{
    text-align: center;
    color:#666699;
}
.container .t1{
   
    color:red;
    font-size:20px;
    background-color: rgba(199, 165, 0,0.5);
    border:2px solid black;
    
}
.container .t1:hover{
    background-color:#FFC300 ;
}
.container .t2{
    
    border:2px solid ;
    
}
.container table, th, td {
    
  border: 1px solid black;
  text-align: center;
  
}
.container th, td {
  border-bottom: 1px solid #ddd;
}
.container tr:hover {background-color: #f5f5f5;}
       </style>        


</head>
<body style="background:linear-gradient(120deg,#2980b9,#8e44ad);">
<form method="post" action="result_admin.jsp">
<table align="center" width="50%" border="0" cellspacing="4" cellpadding="4">
<tr>
<th colspan="50" bgcolor="#C7A500  " width="100%"><font face="arial" size="6px" color="white" align="left"><b>Result Details</b></font></th>
</tr>
<tr>
<td><font face="verdana" size="4px" color="white">Test ID</font></td>
<td><input type="text" name="test_id" value="all" size="20" placeholder="Search Test ID.."/>
<td colspan="50" align="left"><input   size="20" type="submit" value="Search"/></td>

</tr>
</table>
    
<div class="container">
    


<%
try{
Connection connection = null;
PreparedStatement statement = null;
Statement stat=null;
ResultSet resultSet = null;
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");

    
    String sql=null;
    String s="all";

if( ( (request.getParameter("test_id").toString()).equals(s) )  ) {
    sql ="select * from result";
    stat=connection.createStatement();
    resultSet= stat.executeQuery(sql);
}
else {
    int test_id= Integer.parseInt(request.getParameter("test_id"));
    sql ="select * from result where TEST_ID=?";
    statement=connection.prepareStatement(sql);
    statement.setInt(1,test_id);
    resultSet = statement.executeQuery();
}

%>
<table class="center">
<tr>
<td class="t1">student id</td>
<td class="t1">test id</td>
<td class="t1">marks obtained</td>

</tr>
<%
while(resultSet.next()){
%>


<tr>
<td class="t2"><%=resultSet.getString("s_id") %></td>
<td class="t2"><%=resultSet.getString("test_id") %></td>
<td class="t2"><%=resultSet.getInt("marks_obtained") %></td>
</tr>

<%
  %> <br>

<%
}

connection.close();
} catch (Exception e) {
       // out.println("error");
        try{
                Connection connection = null;
                PreparedStatement statement = null;
                Statement stat=null;
                ResultSet resultSet = null;
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                String sql ="select * from result";
                stat=connection.createStatement();
                resultSet= stat.executeQuery(sql);
                %>
<table class="center">
<tr>
<td class="t1">student id</td>
<td class="t1">test id</td>
<td class="t1">marks obtained</td>

</tr>
<%
while(resultSet.next()){
%>


<tr>
<td class="t2"><%=resultSet.getString("s_id") %></td>
<td class="t2"><%=resultSet.getString("test_id") %></td>
<td class="t2"><%=resultSet.getInt("marks_obtained") %></td>
</tr>

<%
  %> <br>

<%
         }
        }catch(Exception ex){}
        }
%>
</table>
</div>


</form>
</body>
</html>
    