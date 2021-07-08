<%-- 
    Document   : deleteone
    Created on : Apr 12, 2021, 4:14:12 PM
    Author     : Anjali
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<%
String  no=(request.getParameter("TID"));

try
{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
Statement st=conn.createStatement();
String sql="delete  from teacher where TID=? ";
PreparedStatement p = conn.prepareStatement(sql);
p.setString(1,no);
p.executeUpdate();

request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Teacher: Delete Successfully!'");
        out.println("alert(msg)");
        out.println("</script>");
        
                        
                         RequestDispatcher rd=request.getRequestDispatcher("deleteteacher.jsp");  
                      rd.include(request, response);
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
