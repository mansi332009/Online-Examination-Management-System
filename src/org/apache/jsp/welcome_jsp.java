package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
Class.forName("org.apache.derby.jdbc.ClientDriver");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Add Questions Form</title>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("background:linear-gradient(120deg,#2980b9,#8e44ad);\n");
      out.write("            }            \n");
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
      out.write("  margin-left: 400px;\n");
      out.write("  padding: 1px 16px;\n");
      out.write("  height: 1000px;\n");
      out.write("}\n");
      out.write(".sidebar p{\n");
      out.write("\t\t\n");
      out.write("\t\tfont-size:40px;\n");
      out.write("\t\tpadding:16px;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tfont-family: cursive;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("              \n");
      out.write("  \n");
      out.write("           \n");
      out.write("        \n");
      out.write("                \n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("\t<p>EXAM</br>ONLINE</p>\n");
      out.write("  <a href=\"profile_teacher.jsp?st_id=");
      out.print(request.getParameter("std"));
      out.write("\">Profile</a>\n");
      out.write("  <a href=\"./TestReg.jsp\">Create Exam</a>\n");
      out.write("  <a href=\"result_student.jsp?st_id=");
      out.print(request.getParameter("std"));
      out.write("\">Result</a>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("       \n");
      out.write("        \n");
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
