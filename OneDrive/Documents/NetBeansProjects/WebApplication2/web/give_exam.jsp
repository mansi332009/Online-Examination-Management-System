<%@page import="java.lang.*"%>
<%-- 
    Document   : give_exam
    Created on : 9 Mar, 2021, 2:05:04 PM
    Author     : dell
--%>


<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            #countdown{
                background-color: #9400D3;
                color:white;
                height:30px;
                text-align: center;
                display:center;
                font-size: 20px;
                font-weight:bold;
                padding-top:5px;
            }
            .test_info {
              text-decoration: none;  
  border: none;
  background-color: inherit;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  display: inline-block;
  color:red;
  display:none;
}
        </style>
        <title>JSP Page</title>
        <script type = "text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};

</script>

</head>
    <body>
        
        <form action="add.jsp" method="post">
            <%
            String s= request.getParameter("exam").toString();
           
            %>
            <input type="text" class="test_info" value="<%=s%>" name="test_no" size="50" >
            <center>
            <p style="font-family:Lucida Console;background-color: #EE82EE;color:white;height:30px;
                text-align: center;
                display:center;
                font-size: 20px;
                width:60%;
                font-weight:bold;padding-top:5px;"> Enter Your Student ID : (Make sure this is Your Smart ID at University)</p>
            <p style="margin-bottom:60px;font-family:Lucida Console;">  <input type="text" style="background-color: #9370DB;
                color:white;
                height:30px;
                text-align: center;
                display:center;
                font-size: 20px;
                width:16%;
                font-weight:bold;
                padding-top:5px; border:none;" name="id" id="st_id" value="<%=request.getParameter("st_id")%>" size="50" /></p>
            <table style="margin-top: 20px; margin-bottom: 40px;font-size:20px;font-family:Lucida Console;border-collapse:separate; border-spacing:0 15px;">
                
           <%
               Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
               
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        st=conn.createStatement();
                        
                        
                        
                        String qry="select * from exam";
                        String sql="select test_min,test_sec FROM test WHERE test_id=?";
                        rs=st.executeQuery(qry);
                        PreparedStatement p = conn.prepareStatement(sql);
                        p.setString(1,request.getParameter("exam").toString());
                        ResultSet r =p.executeQuery();
                        int index=1;
                       while(r.next())
                       {
                           
                           %>
                           <input type="text" name="test_min" id="test_min" style="display:none;" value="<%=r.getString("test_min")%>">
                            <input type="text" name="test_sec" id="test_sec" style="display:none;" value="<%=r.getString("test_sec")%>">
                            <p style="background-color: #D8BFD8;
                color:white;
                height:30px;
                text-align: center;
                display:center;
                font-size: 20px;
                font-weight:bold;
                padding-top:5px;">Time Remaining</p>
                            <p id="countdown"><%=r.getString("test_min")%>:<%=r.getString("test_sec")%></p>
                            <script type="text/javascript" >
                        let time = (parseFloat((document.getElementById("test_min")).value)*60)+parseFloat((document.getElementById("test_sec")).value);
                        const countdownel = document.getElementById('countdown');
                        setInterval(updateCountdown , 1000);
                        let id=(document.getElementById('st_id').value).toString();
                        function updateCountdown(){
                            const min = Math.floor(time / 60 );
                            
                            let sec = time % 60;
                            if(min === 0 && sec === 0)
                                window.location.href="cancel.jsp?st_id="+id;
                            
                            sec = sec < 10 ? '0'+sec : sec;
                            
                            countdownel.innerHTML = min +':'+ sec;
                            
                               
                            time--;
                            }
                            
                            </script>
                           
                                 <%
                       }
                       
                        while(rs.next())
                        {
                           // out.println(rs.getString(10));
                           // out.println(request.getParameter("exam"));
                            if(((rs.getString("test_id")).toString()).equals(request.getParameter("exam").toString()))
                            {
                         %> 
                         
                           <tr>
                               <td colspan="1" ><%=index%>.&nbsp;&nbsp;</td>
                               <td colspan="8" ><%= rs.getString(2)%>&nbsp;&nbsp;&nbsp;(&nbsp;Max marks:<%= rs.getString(7)%>&nbsp;) </td>
                           </tr>
                           <tr>
                               <td colspan="1" ></td>
                               <td ><input type="radio" name="<%=rs.getString("q_id")%>" value="<%=rs.getString(3)%>"></td>
                               <td><%= rs.getString(3)%></td>
                               <td><input type="radio" name="<%=rs.getString("q_id")%>" value="<%=rs.getString(4)%>"></td>
                               <td ><%= rs.getString(4)%></td>
                               <td><input type="radio" name="<%=rs.getString("q_id")%>" value="<%=rs.getString(5)%>"></td>
                               <td ><%= rs.getString(5)%></td>
                               <td ><input type="radio" name="<%=rs.getString("q_id")%>" value="<%=rs.getString(6)%>"></td>
                               <td ><%= rs.getString(6)%></td>
                           </tr>
                           
                        <%
                            index++;
                            }
                                else{continue;}
                        }
                 %>
                 </table> 
                 <input type="submit" style="margin-top: 30px;height: 40px;width: 16%;font-size:22px;background-color:#9400D3; color:white;font-weight:bold;
                        border: 2px"><%     
               }
               catch(Exception ex){}
               %>
           </center>
               </form>
       </body>
</html>
