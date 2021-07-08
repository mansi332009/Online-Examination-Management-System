<%-- 
    Document   : addthree
    Created on : 14 May, 2021, 6:35:16 PM
    Author     : Mansi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<%
int qid=Integer.parseInt(request.getParameter("q_id"));
String qname=request.getParameter("question");
String option_1=request.getParameter("option_1");
String option_2=request.getParameter("option_2");
String option_3=request.getParameter("option_3");
String option_4=request.getParameter("option_4");
String correctans=request.getParameter("correct_ans");
int total=Integer.parseInt(request.getParameter("total_marks"));
int test_id=Integer.parseInt(request.getParameter("test_id"));

try
{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
Statement st=conn.createStatement();

String query = ("insert into exam(q_id,question,option_1,option_2,option_3,option_4,total_marks,test_id,correct_ans)values(?,?,?,?,?,?,?,?,?)");
          PreparedStatement pt = conn.prepareStatement(query);
           pt.setInt(1, qid);
           pt.setString(2,qname);
           pt.setString(3,option_1);
           pt.setString(4,option_2);
           pt.setString(5,option_3);
           pt.setString(6,option_4);
               
           pt.setInt(7, total);
          
            pt.setInt(8,test_id);
            pt.setString(9,correctans);
            
           
           
           pt.executeUpdate();
request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Question Added succesfully!'");
        out.println("alert(msg)");
        out.println("</script>");
         
                        
                         RequestDispatcher rd=request.getRequestDispatcher("addquestion.jsp");  
                      rd.include(request, response);
            
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>


