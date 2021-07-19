<%-- 
    Document   : delete
    Created on : Apr 12, 2021, 4:13:16 PM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<%
int rno=Integer.parseInt(request.getParameter("rno"));
try
{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM student WHERE rno="+rno);
request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Student: delete successfully!'");
        out.println("alert(msg)");
        out.println("</script>");
        
                        
                         RequestDispatcher rd=request.getRequestDispatcher("deleteuser.jsp");  
                      rd.include(request, response);
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
