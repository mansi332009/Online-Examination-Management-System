<%-- 
    Document   : add
    Created on : 10 Mar, 2021, 1:13:27 PM
    Author     : dell
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD</title>
        <script type = "text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
</script>
    </head>
    
        
           <%
               Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
             //  ResultSet ts=null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        st=conn.createStatement();
                        int c=0,s=0;
                         int test_id=Integer.parseInt(request.getParameter("test_no"));
                        String qry="select * from exam where test_id="+ test_id;
                       //  String qery="select * from result";
                       
                        rs=st.executeQuery(qry);
                       String st_id = request.getParameter("id");
                      // ts=st.executeQuery(qery);
                      
                    //   if(flag==0){
                        while(rs.next())
                        {
                           // out.println((request.getParameter(rs.getString(1))).toString());
                           // out.print(rs.getString(9).toString());
                           s+=Integer.parseInt(rs.getString("total_marks"));
                           try{
                           if(((request.getParameter(rs.getString("q_id"))).toString()).equals((rs.getString("correct_ans")).toString()))
                                c+=Integer.parseInt(rs.getString("total_marks"));
                           }catch(Exception ex){}
                           
                        }
                       
                        PreparedStatement stmt=conn.prepareStatement("insert into result values(?,?,?)");  
                        stmt.setInt(2,test_id);
                        stmt.setString(1,st_id);
                        stmt.setInt(3,c);
                        stmt.executeUpdate();
                        %>
                        
                        <center>
                           <p style="margin-top:300px;font-family:Lucida Console;font-weight:20px;font-size:20px;color:red;"> Your score is  <%=c%>  out of <%=s%></p>
                           <a href="student_aftr_login.jsp?st_id=<%=st_id%>">MENU PAGE</a>
                        </center>
                        <%
                        
                    
                    
                 }
               catch(Exception ex){}
              %>
               
                 
               
    
</html>
