<%-- 
    Document   : viewexam
    Created on : Apr 21, 2021, 11:48:26 AM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/onlinexam";
String database = "EXAM";

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
    <head> <link href="eightteen.css" rel="stylesheet" type="text/css"/></head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<body>
<div class="container">
    <div class="title">
    <h1>Exam Details</h1>
    </div>
<table class="center" style="table-layout:fixed;width:100%;" border="1">
<tr>
<td class="t1">QUESTION ID</td>
<td class="t1">QUESTION</td>
<td class="t1">OPTION_1</td>
<td class="t1">OPTION_2</td>
<td class="t1">OPTION_3</td>
<td class="t1">OPTION_4</td>
<td class="t1">TOTAL_MARKS</td>
<td class="t1">TEST ID</td>
<td class="t1">CORRECT ANSWER</td>
<td class="t1">Delete</td>
</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
statement=connection.createStatement();
String sql ="select * from EXAM";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>
<tr>
<td class="t2"><%=resultSet.getInt("Q_ID") %></td>
<td class="t2"><%=resultSet.getString("QUESTION") %></td>
<td class="t2"><%=resultSet.getString("OPTION_1") %></td>
<td class="t2"><%=resultSet.getString("OPTION_2") %></td>
<td class="t2"><%=resultSet.getString("OPTION_3") %></td>
<td class="t2"><%=resultSet.getString("OPTION_4") %></td>
<td class="t2"><%=resultSet.getInt("TOTAL_MARKS") %></td>
<td class="t2"><%=resultSet.getInt("TEST_ID") %></td>
<td class="t2"><%=resultSet.getString("CORRECT_ANS") %></td>
<td><a href="deleteExam.jsp?TEST_ID=<%=resultSet.getInt("TEST_ID") %>"><button type="button" class="delete">Delete</button></a></td>
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