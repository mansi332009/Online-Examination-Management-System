package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class addquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String database = "exam";

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
      out.write("    <head> <link href=\"seventeen.css\" rel=\"stylesheet\" type=\"text/css\"/></head>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"title\" style=\"text-align:center\">\n");
      out.write("    <h1>ADD QUESTION</h1>\n");
      out.write("    </div>\n");
      out.write("<table class=\"center\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"t1\">QUESTION ID</td>\n");
      out.write("<td class=\"t1\">QUESTION</td>\n");
      out.write("<td class=\"t1\">OPTION 1</td>\n");
      out.write("<td class=\"t1\">OPTION 2</td>\n");
      out.write("<td class=\"t1\">OPTION 3</td>\n");
      out.write("<td class=\"t1\">OPTION 4</td>\n");
      out.write("<td class=\"t1\">TOTAL MARKS</td>\n");
      out.write("<td class=\"t1\">TEST ID</td>\n");
      out.write("<td class=\"t1\">CORRECT ANSWER </td>\n");
      out.write("<td class=\"t1\">ADD QUESTION</td>\n");
      out.write("</tr>\n");
      out.write("    \n");

try{
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
statement=connection.createStatement();
String sql ="select * from exam";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getInt("q_id") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("question") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("option_1") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("option_2") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("option_3") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("option_4") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getInt("total_marks") );
      out.write("</td>\n");
      out.write("\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("correct_ans") );
      out.write("</td>\n");
      out.write("<td><a href=\"addthree.jsp?TEST_ID=");
      out.print(request.getParameter("test_id") );
      out.write("\"><button type=\"button\" class=\"delete\">ADD</button></a></td>\n");
      out.write("</tr>\n");

i++;
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
