<%-- 
    Document   : addquestion
    Created on : May 13, 2021, 5:50:34 PM
    Author     : Mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "org.apache.derby.jdbc.ClientDriver";

String database = "exam";

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
    <h1>ADD QUESTION</h1>
    </div>
<table class="center" border="1">
<tr>
<td class="t1">QUESTION ID</td>
<td class="t1">QUESTION</td>
<td class="t1">OPTION 1</td>
<td class="t1">OPTION 2</td>
<td class="t1">OPTION 3</td>
<td class="t1">OPTION 4</td>
<td class="t1">TOTAL MARKS</td>
<td class="t1">TEST ID</td>
<td class="t1">CORRECT ANSWER </td>
<td class="t1">ADD QUESTION</td>
</tr>
    
<%
try{
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
statement=connection.createStatement();
String sql ="select * from exam";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>

<tr>
<td class="t2"><%=resultSet.getInt("q_id") %></td>
<td class="t2"><%=resultSet.getString("question") %></td>
<td class="t2"><%=resultSet.getString("option_1") %></td>
<td class="t2"><%=resultSet.getString("option_2") %></td>
<td class="t2"><%=resultSet.getString("option_3") %></td>
<td class="t2"><%=resultSet.getString("option_4") %></td>
<td class="t2"><%=resultSet.getInt("total_marks") %></td>

<td class="t2"><%=resultSet.getString("correct_ans") %></td>
<td><a href="addthree.jsp?TEST_ID=<%=request.getParameter("test_id") %>"><button type="button" class="delete">ADD</button></a></td>
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


