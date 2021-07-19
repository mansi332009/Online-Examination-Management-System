package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class teacher_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <link href=\"newcss1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: \"Lato\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("div.content {\n");
      out.write("  margin-left: 200px;\n");
      out.write("  margin-right: 200px;\n");
      out.write("  padding: 1px 16px;\n");
      out.write("  height: 1000px;\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("    display: block;\n");
      out.write("    width: 110px;\n");
      out.write("    height: 25px;\n");
      out.write("    background: #4E9CAF;\n");
      out.write("    padding: 10px;\n");
      out.write("    text-align: center;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: bold;\n");
      out.write("    line-height: 25px;\n");
      out.write("    margin-top: 5px;\n");
      out.write("    margin-left:1095px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<a class=\"button\" href=\"TeacherWelcome.jsp?teacher_id=");
      out.print(request.getParameter("teacher_id"));
      out.write("\">Menu Page</a>\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("  <h2>YOUR PROFILE</h2>\n");
      out.write("  \n");
      out.write("         <form action=\"profile_servlet\" method=\"post\" >\n");
      out.write("            ");

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
                               
                            
      out.write("\n");
      out.write("                            <div class=\"user-details\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Full Name</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your name\" name=\"sname\" value=\"");
      out.print(rs.getString(1));
      out.write("\" required>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Username</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your user name\" name=\"uname\" value=\"");
      out.print(rs.getString(2));
      out.write("\" required>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Email</span>\n");
      out.write("                        <input type=\"email\" placeholder=\" Enter Your email\" name=\"email\" value=\"");
      out.print(rs.getString(3));
      out.write("\" required>    \n");
      out.write("                </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Smart Id</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your ID\" name=\"id\" value=\"");
      out.print(rs.getString(4));
      out.write("\" disabled>            \n");
      out.write("                \n");
      out.write("                   <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Department</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"your department\" name=\"dept\" value=\"");
      out.print(rs.getString(5));
      out.write("\" required>            \n");
      out.write("                </div>  \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Password</span>\n");
      out.write("                        <input type=\"password\" placeholder=\" Enter Your password\" name=\"password\" value=\"");
      out.print(rs.getString(6));
      out.write("\" required>            \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    <input type=\"text\" placeholder=\" Enter Your ID\" name=\"id\" style=\"display:none;\" value=\"");
      out.print(rs.getString(4));
      out.write("\">\n");
      out.write("        \n");
      out.write("        <input type=\"submit\" value=\"Save Changes\" style=\"background-color:#32527b;color:white;width:150px;height:50px;margin-left:20px;font-size:15px;\">\n");
      out.write("        </div> \n");
      out.write("        </form>\n");
      out.write("        ");

                    }
                }
            }catch(Exception e)
                {out.println("user not exist");}
        
      out.write("\n");
      out.write("         \n");
      out.write("                \n");
      out.write("\n");
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
