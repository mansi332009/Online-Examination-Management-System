package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class addstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
Class.forName("org.apache.derby.jdbc.ClientDriver");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Add Student Form</title>\n");
      out.write("        <link href=\"three.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"title\"> Add Student</div>\n");
      out.write("            <form action=\"addstudentServlet\" method=\"post\">\n");
      out.write("                <div class=\"user-details\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Full Name</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your name\" name=\"sname\" required>            \n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Username</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your user name\" name=\"uname\" required>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Email</span>\n");
      out.write("                        <input type=\"email\" placeholder=\" Enter Your email\" name=\"email\" required>    \n");
      out.write("                </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Smart Id</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your ID\" name=\"id\" required>            \n");
      out.write("                </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Roll no</span>\n");
      out.write("                        <input type=\"number\" placeholder=\" Enter Your Rollno\" name=\"rno\" required>            \n");
      out.write("                </div>\n");
      out.write("                   <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Course</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"Course\" name=\"course\" required>            \n");
      out.write("                </div>  \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Password</span>\n");
      out.write("                        <input type=\"password\" placeholder=\" Enter Your password\" name=\"password\" required>            \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("        <div class=\"button\">\n");
      out.write("            <input type=\"submit\"  value=\"Add\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
