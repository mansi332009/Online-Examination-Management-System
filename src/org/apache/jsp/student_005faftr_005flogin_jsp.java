package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_005faftr_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type = \"text/javascript\" >\n");
      out.write("   function preventBack(){window.history.forward();}\n");
      out.write("    setTimeout(\"preventBack()\", 0);\n");
      out.write("    window.onunload=function(){null};\n");
      out.write("    </script>\n");
      out.write(" <style type=\"text/css\">\n");
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
      out.write("  background-color: green;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

   // response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
  // response.setHeader("Expires","0");
  // response.setHeader("Progma","no-cache");
    
      out.write("\n");
      out.write(" <div class=\"header\">\n");
      out.write("            <center><img src=\"48.png\" alt=\"studenticon\" id=\"image\"></center>\n");
      out.write("</div>\n");
      out.write(" <div class=\"main-content\">   \n");
      out.write("<div class=\"sidebar\">\n");
      out.write("\t<p>EXAM</br>ONLINE</p>\n");
      out.write("        <ul>\n");
      out.write("        <li> <a href=\"profile_project.jsp?st_id=");
      out.print(request.getParameter("st_id"));
      out.write("\">Profile</a></li>\n");
      out.write("        <li><a href=\"./exam_project.jsp?st_id=");
      out.print(request.getParameter("st_id"));
      out.write("\">Exam</a></li>\n");
      out.write("        <li><a href=\"result_student.jsp?st_id=");
      out.print(request.getParameter("st_id"));
      out.write("\">Result</a></li>\n");
      out.write("        <li><a href=\"Feedback.jsp?st_id=");
      out.print(request.getParameter("st_id"));
      out.write("\">Feedback</a></li>\n");
      out.write("        <li><a href=\"logout.jsp\">LogOut</a></li>\n");
      out.write("        </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("  <center> <h3>HELLO STUDENT!</h3></center>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("        \n");
      out.write("</body>\n");
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
