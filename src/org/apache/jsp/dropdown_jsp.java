package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dropdown_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: \"Lato\", sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".content {\n");
      out.write("\t\n");
      out.write("  margin-left: 300px;\n");
      out.write("  margin-right: 200px;\n");
      out.write("  padding: 1px 16px;\n");
      out.write("  height: 1000px;\n");
      out.write("  padding:40px;\n");
      out.write("  \n");
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
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script type = \"text/javascript\" >\n");
      out.write("   function preventBack(){window.history.forward();}\n");
      out.write("    setTimeout(\"preventBack()\", 0);\n");
      out.write("    window.onunload=function(){null};\n");
      out.write("</script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <a class=\"button\" href=\"TeacherWelcome.jsp?teacher_id=");
      out.print(request.getParameter("teacher_id"));
      out.write("\">Menu Page</a> \n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("                <form action=\"dropdownServlet\" id=\"Add\">\n");
      out.write("                    <input type=\"text\" name=\"teacher_id\" style=\"display:none;\" value=\"");
      out.print( request.getParameter("teacher_id"));
      out.write("\">\n");
      out.write("                    <input type=\"text\" name=\"test_id\" value=");
      out.print(request.getParameter("test_id"));
      out.write(" style=\"display:none\">\n");
      out.write("          <label for=\"exam\" style=\"padding-top:20px;font-family:cursive;font-size:30px;\">Select the Question:</br></br></br></label>\n");
      out.write("        <select name=\"exam\" id=\"exam\" style=\"font-family:cursive;font-size:30;width:700px;height:40px;text-align:center;\" form=\"ADD\">\n");
      out.write("           \n");
      out.write("            ");

                
                Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        st=conn.createStatement();
                        
                        String qry="select * from exam";
                        rs=st.executeQuery(qry);
                        while(rs.next())
                        {
                            
            
      out.write("                <option value=\"");
      out.print( rs.getString(1) );
      out.print( rs.getString(2) );
      out.print( rs.getString(3) );
      out.print( rs.getString(4) );
      out.print( rs.getString(5) );
      out.print( rs.getString(6) );
      out.print( rs.getString(7) );
      out.print( rs.getString(9) );
      out.write("\">&nbsp;&nbsp;&nbsp; ");
      out.print( rs.getString(2) );
      out.write("&nbsp;&nbsp;&nbsp;\n");
      out.write("                                            1)");
      out.print( rs.getString(3) );
      out.write("&nbsp;&nbsp;\n");
      out.write("                                            2)");
      out.print( rs.getString(4) );
      out.write("&nbsp;&nbsp;\n");
      out.write("                                            3)");
      out.print( rs.getString(5) );
      out.write("&nbsp;&nbsp;\n");
      out.write("                                            4)");
      out.print( rs.getString(6) );
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                            correct ans:");
      out.print( rs.getString(9) );
      out.write("\n");
      out.write("                    </option>\n");
      out.write("          ");

              }
           }
            catch(Exception ex){}
          
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <input type=\"submit\" value=\"ADD\" style=\"background-color:#32527b;color:white;width:100px;height:40px;margin-left:20px;font-size:15px;\">\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
