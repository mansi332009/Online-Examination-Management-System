<%-- 
    Document   : deletetwo
    Created on : Apr 12, 2021, 4:17:10 PM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<%
String id=(request.getParameter("ID"));
try
{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
Statement st=conn.createStatement();

String sql="delete  from FEEDBACK where ID=? ";
PreparedStatement p = conn.prepareStatement(sql);
p.setString(1,id);
p.executeUpdate();
out.println("Data Deleted Successfully!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>

