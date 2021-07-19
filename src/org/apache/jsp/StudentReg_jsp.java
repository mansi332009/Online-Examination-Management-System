package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Registration Form</title>\n");
      out.write("        <link href=\"three.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function validate(){\n");
      out.write("                \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tvar Pass=document.getElementById(\"pass\").value;\n");
      out.write("\t\t\t\tvar CPass=document.getElementById(\"cpass\").value;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif(Pass == \"\"){\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f2\").innerHTML=\"Please enter your password.\" ;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("                                \n");
      out.write("\t\t\t\tif(Pass.length<8){\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f2\").innerHTML=\"Password must be of at least 8 characters long.\" ;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(Pass.search(/[a-z]/) == -1){\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f2\").innerHTML=\"There must be at least 1 lowercase character.\" ;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(Pass.search(/[A-Z]/) == -1){\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f2\").innerHTML=\"There must be  at least 1 uppercase character.\" ;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(Pass.search(/[0-9]/) == -1){\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f2\").innerHTML=\"There must be at least 1 number .\" ;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse{\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f2\").innerHTML=\"\";\n");
      out.write("\t\t\t\t}\n");
      out.write("                               if(CPass == \"\"){\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f3\").innerHTML=\"Please enter your Confirm password.\" ;\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif(CPass!=Pass){\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f3\").innerHTML=\"Password not matched!! Please re-enter your correct password.\";\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\telse{\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"f3\").innerHTML=\"\";\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\t\t\t}\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"title\">Student Registration</div>\n");
      out.write("        <form id=\"form\" action=\"RegisterServlet\"  onsubmit= \"return validate()\">\n");
      out.write("            <div class=\"user-details\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Full Name</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your name\" name=\"sname\" id='full-name' required pattern=\"^[a-zA-Z]+(?:\\s[a-zA-Z]+)+$\"/><span id=m7></span>         \n");
      out.write("                    </div>\n");
      out.write("             \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Username</span>\n");
      out.write("                        <input type=\"text\" id=\"txtUsername\"placeholder=\" Enter Your user name\" name=\"uname\" required>            \n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Email</span>\n");
      out.write("                        <input type=\"email\"  name=\"email\"  placeholder=\"Enter your Email\" required >    \n");
      out.write("                </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Smart Id</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your ID\" name=\"id\" id='user-id' required pattern=\"^[A-Za-z0-9_]{10}\"/><span id=m1></span>        \n");
      out.write("                </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Roll no</span>\n");
      out.write("                        <input type=\"number\"  id=\"roll-user\" placeholder=\" Enter Your Rollno\" name=\"rno\"  required pattern=\"^[1-9][0-9]{9}$\"/><span id=m8></span>              \n");
      out.write("                </div>\n");
      out.write("                   <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Course</span>\n");
      out.write("                        <input type=\"text\" placeholder=\"Course\" name=\"course\" required>            \n");
      out.write("                </div>  \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">password</span>\n");
      out.write("            <input type=\"password\" id=\"pass\" name=\"password\" placeholder=\"Enter your Password\"><div id=\"f2\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\"> Confirm password</span>\n");
      out.write("            <input type=\"password\" id=\"cpass\" name=\"cpassword\" placeholder=\"Enter Confirm  Password\"><div id=\"f3\"></div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"button\">\n");
      out.write("            \n");
      out.write("             <input  type=\"submit\"    class=\"pure-button pure-button-primary\" value =\"Register\"/>\n");
      out.write("            <a href=\"Login.jsp\">Already have Account?</a>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("            <div id=\"message\">\n");
      out.write("  <h3>Password must contain the following:</h3>\n");
      out.write("  <p id=\"letter\" class=\"invalid\">A <b>lowercase</b> letter</p>\n");
      out.write("  <p id=\"capital\" class=\"invalid\">A <b>capital (uppercase)</b> letter</p>\n");
      out.write("  <p id=\"number\" class=\"invalid\">A <b>number</b></p>\n");
      out.write("  \n");
      out.write("  <p id=\"length\" class=\"invalid\">Minimum <b>8 characters</b></p>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
