package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Feedback Form</title>\n");
      out.write("        <link href=\"five.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("         <script src=\"namecheck.js\"></script>\n");
      out.write("    <style>\n");
      out.write("  .button_style {\n");
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
      out.write("    margin-top: 2px;\n");
      out.write("    margin-left:10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>      \n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <a class=\"button_style\" href=\"student_aftr_login.jsp?st_id=");
      out.print(request.getParameter("st_id"));
      out.write("\">Menu Page</a> \n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div class=\"title\">Send Us your Feedback</div>\n");
      out.write("            <form action=\"feedbackservlet\" method=\"post\">\n");
      out.write("                <div class=\"user-details\">\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Full Name</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your name\" name=\"SNAME\" id='full-name' required pattern=\"^[a-zA-Z]+(?:\\s[a-zA-Z]+)+$\"/><span id=m7></span>                 \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Email</span>\n");
      out.write("                        <input type=\"email\" placeholder=\" Enter Your email\" name=\"EMAIL\" required>    \n");
      out.write("                </div> \n");
      out.write("               \n");
      out.write("                \n");
      out.write("                     <div class=\"experience-details\">\n");
      out.write("            <input type=\"radio\" name=\"EXPERIENCE\"  value=\"Good\" id=\"dot-3\">\n");
      out.write("            <input type=\"radio\" name=\"EXPERIENCE\"  value=\"Average\" id=\"dot-4\">\n");
      out.write("            <input type=\"radio\" name=\"EXPERIENCE\" value=\"Bad\" id=\"dot-5\">\n");
      out.write("            <span class=\"experience-title\">How do you rate your overall experience?</span>\n");
      out.write("            <div class=\"experience-category\">\n");
      out.write("                <label for=\"dot-3\">\n");
      out.write("                    <span class=\"dot three\"></span>\n");
      out.write("                    <span class=\"experience\">Good</span>\n");
      out.write("                </label>\n");
      out.write("                <label for=\"dot-4\">\n");
      out.write("                    <span class=\"dot four\"></span>\n");
      out.write("                    <span class=\"experience\">Average</span>\n");
      out.write("                </label>\n");
      out.write("                <label for=\"dot-5\">\n");
      out.write("                    <span class=\"dot five\"></span>\n");
      out.write("                    <span class=\"experience\">Bad</span>\n");
      out.write("                </label>\n");
      out.write("        </div>\n");
      out.write("        </div>   \n");
      out.write("                    <div class=\"service-details\">\n");
      out.write("            <input type=\"radio\" name=\"SATISFY\"  value=\"Yes\" id=\"dot-1\">\n");
      out.write("            <input type=\"radio\" name=\"SATISFY\"  value=\"No\" id=\"dot-2\">\n");
      out.write("            <span class=\"service-title\">Did you satisfy with our services?</span>\n");
      out.write("            <div class=\"service-category\">\n");
      out.write("                <label for=\"dot-1\">\n");
      out.write("                    <span class=\"dot one\"></span>\n");
      out.write("                    <span class=\"satisfy\">Yes</span>\n");
      out.write("                </label>\n");
      out.write("                <label for=\"dot-2\">\n");
      out.write("                    <span class=\"dot two\"></span>\n");
      out.write("                    <span class=\"satisfy\">No</span>\n");
      out.write("                </label>\n");
      out.write("        </div>\n");
      out.write("        </div>   \n");
      out.write("                    \n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Message</span>\n");
      out.write("                        <textArea name =\"SUGGESTION\" placeholder=\"YOUR SUGGESTIONS\" style=\" height:150px;\"></textArea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">ID</span>\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Your ID\" name=\"ID\" required>            \n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"button\">\n");
      out.write("            <input  type=\"submit\"  value =\"Submit\" onclick=\"validate()\" />\n");
      out.write("        </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
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
