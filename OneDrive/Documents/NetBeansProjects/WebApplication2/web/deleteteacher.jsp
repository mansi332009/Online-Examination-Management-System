<%-- 
    Document   : deleteteacher
    Created on : Apr 12, 2021, 4:15:26 PM
    Author     : Anjali
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/student";
String database = "TEACHER";
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
    <div class="title">
    <h1>Delete Teacher By Admin</h1>
    </div>
<table  class="center" border="1">
<tr>
    <td class="t1">NAME</td>
<td class="t1">USER NAME</td>
<td class="t1">EMAIL</td>
<td class="t1">ID</td>
<td class="t1">DEPARTMENT</td>

<td class="t1">DELETE</td>
</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
statement=connection.createStatement();
String sql ="select * from TEACHER";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>
<tr>
    <td class="t2"><%=resultSet.getString("TSNAME") %></td>
<td class="t2"><%=resultSet.getString("TUNAME") %></td>
<td class="t2"><%=resultSet.getString("TEMAIL") %></td>
<td class="t2"><%=resultSet.getString("TID") %></td>
<td class="t2"><%=resultSet.getString("DEPT") %></td>


<td><a href="deleteone.jsp?TID=<%=resultSet.getString("TID") %>"><button type="button" class="delete">Delete</button></a></td>
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


