<%-- 
    Document   : exam_project.html
    Created on : 10 Mar, 2021, 8:30:23 PM
    Author     : Mansi
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
body {
  margin: 0;
  font-family: "Lato", sans-serif;
}



.content {
	
  margin-left: 300px;
  margin-right: 200px;
  padding: 1px 16px;
  height: 1000px;
  padding:40px;
  
}
.button {
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
    margin-left:1095px;
}


</style>
<script type = "text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
</script>
        <title>JSP Page</title>
    </head>
    <body>
       <a class="button" href="student_aftr_login.jsp?st_id=<%=request.getParameter("st_id")%>">Menu Page</a> 

        <div class="content">
                <form action="./give_exam.jsp" id="start_exam">
                    <input type="text" name="st_id" style="display:none;" value="<%= request.getParameter("st_id")%>">
          <label for="exam" style="padding-top:20px;font-family:cursive;font-size:30px;">Select the test:</br></br></br></label>
        <select name="exam" id="exam" style="font-family:cursive;font-size:30;width:700px;height:40px;text-align:center;" form="start_exam">
           
            <%
                Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        st=conn.createStatement();
                        
                        String qry="select * from test";
                        rs=st.executeQuery(qry);
                        while(rs.next())
                        {
                            
%>                <option value="<%= rs.getString(3) %>"><%= rs.getString(1)%>&nbsp;&nbsp;(&nbsp;Total Marks : <%= rs.getString(2) %>&nbsp;)</option>
          <%
              }
           }
            catch(Exception ex){}
          %>
        </select>
        <input type="submit" value="start exam" style="background-color:#32527b;color:white;width:100px;height:40px;margin-left:20px;font-size:15px;">
        </form>
        </div>


    </body>
</html>
