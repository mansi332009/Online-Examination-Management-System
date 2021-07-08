<%-- 
    Document   : search
    Created on : Apr 12, 2021, 4:33:27 PM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/student";
String database = "student";

int rno= Integer.parseInt(request.getParameter("rno"));
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Detail</title>
        <meta charset="UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link href="sixteen.css" rel="stylesheet" type="text/css"/> 
    </head>
<body>
<div class="container">
    


<%
try{
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
statement=connection.createStatement();
String sql=null;
sql ="select * from student where rno="+rno+" ";
resultSet = statement.executeQuery(sql);
boolean f=false;

while(resultSet.next()){
%>
<div class ="title">
    <h1>Student  Detail</h1>
</div>
<table class="center">
<tr>
<td class="t1">Name</td>
<td class="t1">USER Name</td>
<td class="t1">Email Id</td>
<td class="t1">ID</td>
<td class="t1">Roll No</td>
<td class="t1">Course</td>
</tr>
<tr>
<td class="t2"><%=resultSet.getString("sname") %></td>
<td class="t2"><%=resultSet.getString("uname") %></td>
<td class="t2"><%=resultSet.getString("email") %></td>
<td class="t2"><%=resultSet.getString("id") %></td>

<td class="t2"><%=resultSet.getInt("rno") %></td>
<td class="t2"><%=resultSet.getString("course") %></td>
</tr>

<%
    
    f=true;
    
}
if(f==false)
{
  out.println("student does not exists");
  %> <br>

<%
}

connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>
</body>
</html>

