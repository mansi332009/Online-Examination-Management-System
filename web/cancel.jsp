<%-- 
    Document   : cancel
    Created on : May 11, 2021, 2:13:46 PM
    Author     : Dell
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
<style>
    .button {
        text-decoration: none;
    display: block;
    width: 110px;
    height: 25px;
    background: #4E9CAF;
    padding: 10px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
    line-height: 25px;
    margin-top: 5px;
   
}
</style>
    </head>
    
        
           <%
               
               try {
                        
                       
                        %>
                        
                        <center>
                           <p style="margin-top:300px;font-family:Lucida Console;font-weight:20px;font-size:20px;color:red;">TIME UP !!TRY NEXT TIME!!</p>
                           <a class="button" href="student_aftr_login.jsp?st_id=<%=request.getParameter("st_id")%>">MENU PAGE</a>
                        </center>
                        <%
                        
                    
                    
                 }
               catch(Exception ex){}
              %>
               
                 
               
    
</html>
