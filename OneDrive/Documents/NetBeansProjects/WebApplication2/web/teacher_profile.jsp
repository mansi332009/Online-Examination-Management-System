<%-- 
    Document   : teacher_profile
    Created on : Apr 20, 2021, 10:08:28 AM
    Author     : Dell
--%>

<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <link href="newcss1.css" rel="stylesheet" type="text/css"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {
  margin: 0;
  font-family: "Lato", sans-serif;
}



div.content {
  margin-left: 200px;
  margin-right: 200px;
  padding: 1px 16px;
  height: 1000px;
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
</head>
<body>
    
<a class="button" href="TeacherWelcome.jsp?teacher_id=<%=request.getParameter("teacher_id")%>">Menu Page</a>

<div class="content">
  <h2>YOUR PROFILE</h2>
  
         <form action="profile_servlet" method="post" >
            <%
                Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        String str=(request.getParameter("teacher_id")).toString();
                        st=conn.createStatement();
                        String qry="select * from teacher";
                      //  st=conn.prepareStatement(qry);
                      //  st.setString(1,str);
                                
                       rs = st.executeQuery(qry);
                       while(rs.next()){
                           
                           if(rs.getString(4).equals(str)){
                               
                            %>
                            <div class="user-details">
                    <div class="input-box">
                        <span class="details">Full Name</span>
                        <input type="text" placeholder=" Enter Your name" name="sname" value="<%=rs.getString(1)%>" required>            
                </div>
                <div class="input-box">
                        <span class="details">Username</span>
                        <input type="text" placeholder=" Enter Your user name" name="uname" value="<%=rs.getString(2)%>" required>            
                </div>
                <div class="input-box">
                        <span class="details">Email</span>
                        <input type="email" placeholder=" Enter Your email" name="email" value="<%=rs.getString(3)%>" required>    
                </div>
                    <div class="input-box">
                        <span class="details">Smart Id</span>
                        <input type="text" placeholder=" Enter Your ID" name="id" value="<%=rs.getString(4)%>" disabled>            
                
                   <div class="input-box">
                        <span class="details">Department</span>
                        <input type="text" placeholder="your department" name="dept" value="<%=rs.getString(5)%>" required>            
                </div>  
                <div class="input-box">
                        <span class="details">Password</span>
                        <input type="password" placeholder=" Enter Your password" name="password" value="<%=rs.getString(6)%>" required>            
                </div>
                
                </div>
                    
                    <input type="text" placeholder=" Enter Your ID" name="id" style="display:none;" value="<%=rs.getString(4)%>">
        
        <input type="submit" value="Save Changes" style="background-color:#32527b;color:white;width:150px;height:50px;margin-left:20px;font-size:15px;">
        </div> 
        </form>
        <%
                    }
                }
            }catch(Exception e)
                {out.println("user not exist");}
        %>
         
                

</div>
</body>
</html>

