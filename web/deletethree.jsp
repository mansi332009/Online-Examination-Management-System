<%-- 
    Document   : deletethree
    Created on : May 4, 2021, 4:53:34 PM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<%
String EMAIL=(request.getParameter("EMAIL"));
try
{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
Statement st=conn.createStatement();

String sql="delete  from contact where email=? ";
PreparedStatement p = conn.prepareStatement(sql);
p.setString(1, EMAIL);
p.executeUpdate();
request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Contact Data : Delete Successfully!'");
        out.println("alert(msg)");
        out.println("</script>");
         
                        
                         RequestDispatcher rd=request.getRequestDispatcher("contactmanage.jsp");  
                      rd.include(request, response);
            
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>

