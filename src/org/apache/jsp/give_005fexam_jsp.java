package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.sql.*;

public final class give_005fexam_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            #countdown{\n");
      out.write("                background-color: #9400D3;\n");
      out.write("                color:white;\n");
      out.write("                height:30px;\n");
      out.write("                text-align: center;\n");
      out.write("                display:center;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight:bold;\n");
      out.write("                padding-top:5px;\n");
      out.write("            }\n");
      out.write("            .test_info {\n");
      out.write("              text-decoration: none;  \n");
      out.write("  border: none;\n");
      out.write("  background-color: inherit;\n");
      out.write("  padding: 14px 28px;\n");
      out.write("  font-size: 16px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  display: inline-block;\n");
      out.write("  color:red;\n");
      out.write("  display:none;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type = \"text/javascript\" >\n");
      out.write("   function preventBack(){window.history.forward();}\n");
      out.write("    setTimeout(\"preventBack()\", 0);\n");
      out.write("    window.onunload=function(){null};\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action=\"add.jsp\" method=\"post\">\n");
      out.write("            ");

            String s= request.getParameter("exam").toString();
           
            
      out.write("\n");
      out.write("            <input type=\"text\" class=\"test_info\" value=\"");
      out.print(s);
      out.write("\" name=\"test_no\" size=\"50\" >\n");
      out.write("            <center>\n");
      out.write("            <p style=\"font-family:Lucida Console;background-color: #EE82EE;color:white;height:30px;\n");
      out.write("                text-align: center;\n");
      out.write("                display:center;\n");
      out.write("                font-size: 20px;\n");
      out.write("                width:60%;\n");
      out.write("                font-weight:bold;padding-top:5px;\"> Enter Your Student ID : (Make sure this is Your Smart ID at University)</p>\n");
      out.write("            <p style=\"margin-bottom:60px;font-family:Lucida Console;\">  <input type=\"text\" style=\"background-color: #9370DB;\n");
      out.write("                color:white;\n");
      out.write("                height:30px;\n");
      out.write("                text-align: center;\n");
      out.write("                display:center;\n");
      out.write("                font-size: 20px;\n");
      out.write("                width:16%;\n");
      out.write("                font-weight:bold;\n");
      out.write("                padding-top:5px; border:none;\" name=\"id\" id=\"st_id\" value=\"");
      out.print(request.getParameter("st_id"));
      out.write("\" size=\"50\" /></p>\n");
      out.write("            <table style=\"margin-top: 20px; margin-bottom: 40px;font-size:20px;font-family:Lucida Console;border-collapse:separate; border-spacing:0 15px;\">\n");
      out.write("                \n");
      out.write("           ");

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
                           
                           
      out.write("\n");
      out.write("                           <input type=\"text\" name=\"test_min\" id=\"test_min\" style=\"display:none;\" value=\"");
      out.print(r.getString("test_min"));
      out.write("\">\n");
      out.write("                            <input type=\"text\" name=\"test_sec\" id=\"test_sec\" style=\"display:none;\" value=\"");
      out.print(r.getString("test_sec"));
      out.write("\">\n");
      out.write("                            <p style=\"background-color: #D8BFD8;\n");
      out.write("                color:white;\n");
      out.write("                height:30px;\n");
      out.write("                text-align: center;\n");
      out.write("                display:center;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight:bold;\n");
      out.write("                padding-top:5px;\">Time Remaining</p>\n");
      out.write("                            <p id=\"countdown\">");
      out.print(r.getString("test_min"));
      out.write(':');
      out.print(r.getString("test_sec"));
      out.write("</p>\n");
      out.write("                            <script type=\"text/javascript\" >\n");
      out.write("                        let time = (parseFloat((document.getElementById(\"test_min\")).value)*60)+parseFloat((document.getElementById(\"test_sec\")).value);\n");
      out.write("                        const countdownel = document.getElementById('countdown');\n");
      out.write("                        setInterval(updateCountdown , 1000);\n");
      out.write("                        let id=(document.getElementById('st_id').value).toString();\n");
      out.write("                        function updateCountdown(){\n");
      out.write("                            const min = Math.floor(time / 60 );\n");
      out.write("                            \n");
      out.write("                            let sec = time % 60;\n");
      out.write("                            if(min === 0 && sec === 0)\n");
      out.write("                                window.location.href=\"cancel.jsp?st_id=\"+id;\n");
      out.write("                            \n");
      out.write("                            sec = sec < 10 ? '0'+sec : sec;\n");
      out.write("                            \n");
      out.write("                            countdownel.innerHTML = min +':'+ sec;\n");
      out.write("                            \n");
      out.write("                               \n");
      out.write("                            time--;\n");
      out.write("                            }\n");
      out.write("                            \n");
      out.write("                            </script>\n");
      out.write("                           \n");
      out.write("                                 ");

                       }
                       
                        while(rs.next())
                        {
                           // out.println(rs.getString(10));
                           // out.println(request.getParameter("exam"));
                            if(((rs.getString("test_id")).toString()).equals(request.getParameter("exam").toString()))
                            {
                         
      out.write(" \n");
      out.write("                         \n");
      out.write("                           <tr>\n");
      out.write("                               <td colspan=\"1\" >");
      out.print(index);
      out.write(".&nbsp;&nbsp;</td>\n");
      out.write("                               <td colspan=\"8\" >");
      out.print( rs.getString(2));
      out.write("&nbsp;&nbsp;&nbsp;(&nbsp;Max marks:");
      out.print( rs.getString(7));
      out.write("&nbsp;) </td>\n");
      out.write("                           </tr>\n");
      out.write("                           <tr>\n");
      out.write("                               <td colspan=\"1\" ></td>\n");
      out.write("                               <td ><input type=\"radio\" name=\"");
      out.print(rs.getString("q_id"));
      out.write("\" value=\"");
      out.print(rs.getString(3));
      out.write("\"></td>\n");
      out.write("                               <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                               <td><input type=\"radio\" name=\"");
      out.print(rs.getString("q_id"));
      out.write("\" value=\"");
      out.print(rs.getString(4));
      out.write("\"></td>\n");
      out.write("                               <td >");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("                               <td><input type=\"radio\" name=\"");
      out.print(rs.getString("q_id"));
      out.write("\" value=\"");
      out.print(rs.getString(5));
      out.write("\"></td>\n");
      out.write("                               <td >");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("                               <td ><input type=\"radio\" name=\"");
      out.print(rs.getString("q_id"));
      out.write("\" value=\"");
      out.print(rs.getString(6));
      out.write("\"></td>\n");
      out.write("                               <td >");
      out.print( rs.getString(6));
      out.write("</td>\n");
      out.write("                           </tr>\n");
      out.write("                           \n");
      out.write("                        ");

                            index++;
                            }
                                else{continue;}
                        }
                 
      out.write("\n");
      out.write("                 </table> \n");
      out.write("                 <input type=\"submit\" style=\"margin-top: 30px;height: 40px;width: 16%;font-size:22px;background-color:#9400D3; color:white;font-weight:bold;\n");
      out.write("                        border: 2px\">");
     
               }
               catch(Exception ex){}
               
      out.write("\n");
      out.write("           </center>\n");
      out.write("               </form>\n");
      out.write("       </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
