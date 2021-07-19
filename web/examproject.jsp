<%-- 
    Document   : examproject
    Created on : 12 Apr, 2021, 8:41:55 AM
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

.sidebar {
  margin: 0;
  padding: 0;
  width: 230px;
  background-color:#a62c2b;
  position: fixed;
  height: 100%;
  overflow: auto;
}

.sidebar a {
  display: block;
  color: white;
  padding: 16px;
  font-size:18px;
  text-decoration: none;
  text-align:center;
}
 
.sidebar a:hover{
  color:green;
  background-color: #32527b;
}

.content {
	
  margin-left: 400px;
  padding: 1px 16px;
  height: 1000px;
  padding:40px;
  
}
.sidebar p{
		
		font-size:40px;
		padding:16px;
		text-align:center;
		color:white;
		font-family: cursive;
}



</style>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="sidebar">
	<p>EXAM</br>ONLINE</p>
        <a href="profile_project.jsp?st_id=<%=request.getParameter("std")%>">Profile</a>
        <a href="./exam_project.jsp">Exam</a>
        <a href="result_student.jsp?st_id=<%=request.getParameter("std")%>">Result</a>

      </div>

        <div class="content">
                <form action="./give_exam.jsp" id="start_exam">
                    
          <label for="exam" style="padding-top:20px;font-family:cursive;font-size:30px;">Select the test:</br></br></br></label>
        <select name="exam" id="exam" style="font-family:cursive;font-size:30;width:700px;height:40px;text-align:center;" form="start_exam">
           
            <%
                Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/tbl_user");
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

