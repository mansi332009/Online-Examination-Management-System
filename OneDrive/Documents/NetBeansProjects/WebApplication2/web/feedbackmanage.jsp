<%-- 
    Document   : feedbackmanage
    Created on : Apr 12, 2021, 4:20:20 PM
    Author     : Anjali
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "org.apache.derby.jdbc.ClientDriver";

String database = "FEEDBACK";

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
    <head> <link href="seventeen.css" rel="stylesheet" type="text/css"/></head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<body>
<div class="container">
    <div class="title" style="text-align:center">
    <h1>FEEDBACK MANAGE</h1>
    </div>
<table class="center" border="1">
<tr>
<td class="t1">NAME</td>
<td class="t1">ID</td>

<td class="t1">Email</td>
<td class="t1">EXPERENCE</td>
<td class="t1">SATISFY</td>
<td class="t1">SUGGESTION</td>
<td class="t1">DELETE</td>
</tr>
    
<%
try{
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
statement=connection.createStatement();
String sql ="select * from FEEDBACK";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>

<tr>
<td class="t2"><%=resultSet.getString("SNAME") %></td>
<td class="t2"><%=resultSet.getString("ID") %></td>
<td class="t2"><%=resultSet.getString("EMAIL") %></td>
<td class="t2"><%=resultSet.getString("EXPERIENCE") %></td>
<td class="t2"><%=resultSet.getString("SATISFY") %></td>
<td class="t2"><%=resultSet.getString("SUGGESTION") %></td>
<td><a href="deletetwo.jsp?ID=<%=resultSet.getString("ID") %>"><button type="button" class="delete">Delete</button></a></td>
</tr>
<%
i++;
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

