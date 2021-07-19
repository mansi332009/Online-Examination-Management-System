package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class preview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/student";
String database = "exam";

int test_id= Integer.parseInt(request.getParameter("test_id"));
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
ResultSet r= null;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Student Detail</title>\n");
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
sql ="select * from exam where test_id="+test_id;
String s="select * from test where test_id="+ test_id;

resultSet = statement.executeQuery(sql);
r = statement.executeQuery(s);

boolean f=false;

      out.write("\n");
      out.write("<h3>Test Name:</h3>");
      out.print(r.getString("test_name") );
      out.write("\n");
      out.write("<h3>Total Marks:</h3>");
      out.print(r.getString("total_marks") );
      out.write("\n");
      out.write("<h3>Test ID:</h3>");
      out.print(r.getString("test_id") );
      out.write('\n');

while(resultSet.next()){

      out.write("\n");
      out.write("<div class =\"title\">\n");
      out.write("    <h1>Test Preview</h1>\n");
      out.write("</div>\n");
      out.write("<table class=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"t1\"></td>\n");
      out.write("<td class=\"t1\">USER Name</td>\n");
      out.write("<td class=\"t1\">Email Id</td>\n");
      out.write("<td class=\"t1\">ID</td>\n");
      out.write("<td class=\"t1\">Roll No</td>\n");
      out.write("<td class=\"t1\">Course</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("sname") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("uname") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("email") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("id") );
      out.write("</td>\n");
      out.write("\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getInt("rno") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("course") );
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");

    
    f=true;
    
}
if(f==false)
{
  out.println("student does not exists");
  
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
      out.write("</html>");
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
