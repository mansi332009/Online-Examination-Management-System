<%-- 
    Document   : deleteExam
    Created on : Apr 21, 2021, 11:54:11 AM
    Author     : Anjali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<%
int TEST_ID=Integer.parseInt(request.getParameter("TEST_ID"));
try
{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
Statement st=conn.createStatement();
int i=st.executeUpdate("delete from TEST where TEST_ID="+TEST_ID);
int J=st.executeUpdate("delete from EXAM where TEST_ID="+TEST_ID);
request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Exam deleted successfully!'");
        out.println("alert(msg)");
        out.println("</script>");
        
                        
                         RequestDispatcher rd=request.getRequestDispatcher("viewexam.jsp");  
                      rd.include(request, response);
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>

