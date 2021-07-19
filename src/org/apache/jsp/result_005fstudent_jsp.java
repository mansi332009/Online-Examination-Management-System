package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class result_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: \"Lato\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 230px;\n");
      out.write("  background-color:#a62c2b;\n");
      out.write("  position: fixed;\n");
      out.write("  height: 100%;\n");
      out.write("  overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidebar a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px;\n");
      out.write("  font-size:18px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  text-align:center;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".sidebar a:hover{\n");
      out.write("  color:green;\n");
      out.write("  background-color: #32527b;\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.content {\n");
      out.write("  \n");
      out.write("  padding: 1px 16px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".sidebar p{\n");
      out.write("\t\t\n");
      out.write("\t\tfont-size:40px;\n");
      out.write("\t\tpadding:16px;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tfont-family: cursive;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr, td {\n");
      out.write("  padding: 15px;\n");
      out.write("  text-align: left;\n");
      out.write("  border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("tr:nth-child(even) {background-color: #aaa9ad;}\n");
      out.write("\n");
      out.write("tr:hover{background-color:#D3D3D3;}\n");
      out.write(".header{\n");
      out.write("background-color: #32527b ;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write(".header:hover{background-color: #32527b ;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<div class=\"sidebar\">\n");
      out.write("\t<p>EXAM</br>ONLINE</p>\n");
      out.write("  <a href=\"#profile_project\">Profile</a>\n");
      out.write("  <a href=\"./exam_project.jsp\">Exam</a>\n");
      out.write("  <a href=\"result_student.jsp?st_id=");
      out.print(request.getParameter("std"));
      out.write("\">Result</a>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("    <center>\n");
      out.write("        <table style=\"margin-top: 150px;\">\n");
      out.write("            <tr class=\"header\">\n");
      out.write("                 <td>TEST ID</td>\n");
      out.write("                <td>OBTAINED MARKS</td>\n");
      out.write("            </tr>\n");
      out.write("        ");

               Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        st=conn.createStatement();
                        
                        String qry="select * from result";
                        rs=st.executeQuery(qry);
                        while(rs.next())
                        {
                            if(rs.getString(1).equals(request.getParameter("st_id").toString()))
                            {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                            }
                        }
               }catch(Exception e){}
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("   </center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
