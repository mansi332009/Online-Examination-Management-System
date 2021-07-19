package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class teachersearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/student";
String database = "TEACHER";

String tid= (request.getParameter("TID"));
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Teacher Detail</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <link href=\"sixteen.css\" rel=\"stylesheet\" type=\"text/css\"/> \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");

try{
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
statement=connection.createStatement();
String sql=null;
sql ="select * from Teacher where TID='"+tid+"'";
resultSet = statement.executeQuery(sql);
boolean f=false;

while(resultSet.next()){

      out.write("\n");
      out.write("<div class =\"title\">\n");
      out.write("    <h1><fonr color=\"#1A5276\">Teacher  Detail</font></h1>\n");
      out.write("</div>\n");
      out.write("<table class=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"t1\">Name</td>\n");
      out.write("<td class=\"t1\">USER Name</td>\n");
      out.write("<td class=\"t1\">Email Id</td>\n");
      out.write("<td class=\"t1\"> Teacher ID</td>\n");
      out.write("<td class=\"t1\">DEPARTMENT</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("TSNAME") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("TUNAME") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("TEMAIL") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("TID") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("DEPT") );
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");

    
    f=true;
    
}
if(f==false)
{
  out.println("Teacher does not exists");
  
      out.write(" <br>\n");
      out.write("\n");

}

connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
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
