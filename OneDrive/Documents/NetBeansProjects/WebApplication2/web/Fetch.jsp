<%-- 
    Document   : Fetch
    Created on : 13 Apr, 2021, 4:37:17 PM
    Author     : Mansi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/student";
String database = "exam";

int id= Integer.parseInt(request.getParameter("test_id"));
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
sql ="select * from exam where test_id="+id;


resultSet = statement.executeQuery(sql);


boolean f=false;
%>
<div class ="title">
    <h1>Test Preview</h1>
</div>
<table class="center">
<tr>
<td class="t1">Test ID</td>
<td class="t1">Question ID</td>
<td class="t1">Question</td>
<td class="t1">Option 1</td>
<td class="t1">Option 2</td>
<td class="t1">Option 3</td>
<td class="t1">Option 4</td>
<td class="t1">Question Mark</td>
<td class="t1">Correct Answer</td>

</tr>
<%
while(resultSet.next()){
%>


<tr>
<td class="t2"><%=resultSet.getInt("test_id") %></td>
<td class="t2"><%=resultSet.getInt("q_id") %></td>
<td class="t2"><%=resultSet.getString("question") %></td>
<td class="t2"><%=resultSet.getString("option_1") %></td>
<td class="t2"><%=resultSet.getString("option_2") %></td>

<td class="t2"><%=resultSet.getString("option_3") %></td>
<td class="t2"><%=resultSet.getString("option_4") %></td>
<td class="t2"><%=resultSet.getInt("total_marks") %></td>
<td class="t2"><%=resultSet.getString("correct_ans") %></td>
</tr>

<%
    
    f=true;
    
}
if(f==false)
{
  out.println("Test does not exists");
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
