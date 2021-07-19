package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin panel</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        body {\n");
      out.write("            margin:0px;\n");
      out.write("            border:0px;\n");
      out.write("        }\n");
      out.write("        .header{\n");
      out.write("            width:100%;\n");
      out.write("            height:100px;\n");
      out.write("            background-color:#a62c2b;\n");
      out.write("            color:white;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        #image{\n");
      out.write("            height:80px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 50px;\n");
      out.write("        }\n");
      out.write("        .main-content{\n");
      out.write("            display:flex;\n");
      out.write("        }\n");
      out.write("        .sidebar {\n");
      out.write("            top:0;\n");
      out.write("             margin: 0;\n");
      out.write("             padding: 0;\n");
      out.write("              width: 230px;\n");
      out.write("             background-color:#a62c2b;\n");
      out.write("             position: fixed;\n");
      out.write("            height: 100%;\n");
      out.write("            overflow: scroll;\n");
      out.write("          \n");
      out.write("            flex:1\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .content{\n");
      out.write("            flex:3;\n");
      out.write("            height: 530px;\n");
      out.write("            background-color:white;\n");
      out.write("            font-size:20px;\n");
      out.write("            font-weight:900;\n");
      out.write("        }\n");
      out.write("        ul li{\n");
      out.write("            padding:20px;\n");
      out.write("            border-bottom: 2px solid grey;\n");
      out.write("            list-style-type:none;    \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .sidebar p{\n");
      out.write("\t\t\n");
      out.write("\t\tfont-size:40px;\n");
      out.write("\t\tpadding:16px;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tfont-family: cursive;\n");
      out.write("                \n");
      out.write("}\n");
      out.write(".sidebar a {\n");
      out.write("  display: block;\n");
      out.write("  color: white;\n");
      out.write("  padding: 16px;\n");
      out.write("  font-size:18px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  text-align:center;\n");
      out.write("  \n");
      out.write(" \n");
      out.write("}\n");
      out.write(" \n");
      out.write(".sidebar a:hover{\n");
      out.write("  color:white;\n");
      out.write("  background-color: black;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <center><img src=\"59.png\" alt=\"adminicon\" id=\"image\"></center>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-content\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <p>EXAM</br>ONLINE</p>\n");
      out.write("                <ul>\n");
      out.write("            <li><a href=\"adminTestReg.jsp\">Create Exam</a></li>\n");
      out.write("            <li><a href=\"viewexam.jsp\">View Exam</a></li>\n");
      out.write("            <li><a href=\"result_admin.jsp\">Result</a></li>\n");
      out.write("            <li><a href=\"adduser.jsp\"> Add user</a></li>\n");
      out.write("            \n");
      out.write("              <li><a href=\"studentdetail.html\">View Student Detail</a></li>\n");
      out.write("            <li><a href=\"teacherdetail.html\">View Teacher Detail</a></li>\n");
      out.write("            <li><a href=\"deleteteacher.jsp\"> Delete Teacher</a></li>\n");
      out.write("            <li><a href=\"deleteuser.jsp\"> Delete Student</a></li>\n");
      out.write("            <li><a href=\"feedbackmanage.jsp\"> Manage Feedback</a></li>\n");
      out.write("             <a type=\"button\" onclick=\"myfunc()\">LogOut</a>\n");
      out.write("</ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <center> <h3>Hello Admin!</h3></center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("                function myfunc(){\n");
      out.write("                      if(window.confirm(\"Forwarding to Home page\")===true)\n");
      out.write("                          window.location.replace(\"index.html\");\n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                         \n");
      out.write("                    }\n");
      out.write("                    //INSERT INTO app.\"ADMIN\" VALUES ('mansi saxena','mansi1234','1234');\n");
      out.write("                   </script>\n");
      out.write("                   \n");
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
