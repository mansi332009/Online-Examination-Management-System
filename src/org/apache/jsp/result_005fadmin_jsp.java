package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class result_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>\n");
      out.write("result Search\n");
      out.write("</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("       <style>\n");
      out.write("           .container{\n");
      out.write("    max-width:900px;\n");
      out.write("    width:100%;\n");
      out.write("    \n");
      out.write("    margin-left: 300;\n");
      out.write("    background: #fff;\n");
      out.write("    padding:25px 30px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    margin-top:50px;\n");
      out.write("}\n");
      out.write(".container .center{\n");
      out.write(" \n");
      out.write("  display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  height: 200px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write(".container .title h1{\n");
      out.write("    text-align: center;\n");
      out.write("    color:#666699;\n");
      out.write("}\n");
      out.write(".container .t1{\n");
      out.write("   \n");
      out.write("    color:red;\n");
      out.write("    font-size:20px;\n");
      out.write("    background-color: rgba(199, 165, 0,0.5);\n");
      out.write("    border:2px solid black;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".container .t1:hover{\n");
      out.write("    background-color:#FFC300 ;\n");
      out.write("}\n");
      out.write(".container .t2{\n");
      out.write("    \n");
      out.write("    border:2px solid ;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".container table, th, td {\n");
      out.write("    \n");
      out.write("  border: 1px solid black;\n");
      out.write("  text-align: center;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".container th, td {\n");
      out.write("  border-bottom: 1px solid #ddd;\n");
      out.write("}\n");
      out.write(".container tr:hover {background-color: #f5f5f5;}\n");
      out.write("       </style>        \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body style=\"background:linear-gradient(120deg,#2980b9,#8e44ad);\">\n");
      out.write("<form method=\"post\" action=\"result_admin.jsp\">\n");
      out.write("<table align=\"center\" width=\"50%\" border=\"0\" cellspacing=\"4\" cellpadding=\"4\">\n");
      out.write("<tr>\n");
      out.write("<th colspan=\"50\" bgcolor=\"#C7A500  \" width=\"100%\"><font face=\"arial\" size=\"6px\" color=\"white\" align=\"left\"><b>Result Details</b></font></th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><font face=\"verdana\" size=\"4px\" color=\"white\">Test ID</font></td>\n");
      out.write("<td><input type=\"text\" name=\"test_id\" value=\"all\" size=\"20\" placeholder=\"Search Test ID..\"/>\n");
      out.write("<td colspan=\"50\" align=\"left\"><input   size=\"20\" type=\"submit\" value=\"Search\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("    \n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");

try{
Connection connection = null;
PreparedStatement statement = null;
Statement stat=null;
ResultSet resultSet = null;
connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");

    
    String sql=null;
    String s="all";

if( ( (request.getParameter("test_id").toString()).equals(s) )  ) {
    sql ="select * from result";
    stat=connection.createStatement();
    resultSet= stat.executeQuery(sql);
}
else {
    int test_id= Integer.parseInt(request.getParameter("test_id"));
    sql ="select * from result where TEST_ID=?";
    statement=connection.prepareStatement(sql);
    statement.setInt(1,test_id);
    resultSet = statement.executeQuery();
}


      out.write("\n");
      out.write("<table class=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"t1\">student id</td>\n");
      out.write("<td class=\"t1\">test id</td>\n");
      out.write("<td class=\"t1\">marks obtained</td>\n");
      out.write("\n");
      out.write("</tr>\n");

while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("s_id") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("test_id") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getInt("marks_obtained") );
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");

  
      out.write(" <br>\n");
      out.write("\n");

}

connection.close();
} catch (Exception e) {
       // out.println("error");
        try{
                Connection connection = null;
                PreparedStatement statement = null;
                Statement stat=null;
                ResultSet resultSet = null;
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                String sql ="select * from result";
                stat=connection.createStatement();
                resultSet= stat.executeQuery(sql);
                
      out.write("\n");
      out.write("<table class=\"center\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"t1\">student id</td>\n");
      out.write("<td class=\"t1\">test id</td>\n");
      out.write("<td class=\"t1\">marks obtained</td>\n");
      out.write("\n");
      out.write("</tr>\n");

while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("s_id") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getString("test_id") );
      out.write("</td>\n");
      out.write("<td class=\"t2\">");
      out.print(resultSet.getInt("marks_obtained") );
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");

  
      out.write(" <br>\n");
      out.write("\n");

         }
        }catch(Exception ex){}
        }

      out.write("\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    ");
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
