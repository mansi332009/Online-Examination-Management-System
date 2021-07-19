package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class addthree_jsp extends org.apache.jasper.runtime.HttpJspBase
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

int qid=Integer.parseInt(request.getParameter("q_id"));
String qname=(request.getParameter("question"));
String option_1=(request.getParameter("option_1"));
String option_2=(request.getParameter("option_2"));
String option_3=(request.getParameter("option_3"));
String option_4=(request.getParameter("option_4"));
String correctans=(request.getParameter("correct_ans"));
int total=Integer.parseInt(request.getParameter("total_marks"));
int test_id=Integer.parseInt(request.getParameter("test_id"));

try
{
Class.forName("org.apache.derby.jdbc.ClientDriver");
Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
Statement st=conn.createStatement();

String query = ("insert into exam(q_id,question,option_1,option_2,option_3,option_4,total_marks,test_id,correct_ans)values(?,?,?,?,?,?,?,?,?)");
          PreparedStatement pt = conn.prepareStatement(query);
           pt.setInt(1, qid);
           pt.setString(2,qname);
           pt.setString(3,option_1);
           pt.setString(4,option_2);
           pt.setString(5,option_3);
           pt.setString(6,option_4);
               
           pt.setInt(7, total);
          
            pt.setInt(8,test_id);
            pt.setString(9,correctans);
            
           
           
           pt.executeUpdate();
request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Question Added succesfully!'");
        out.println("alert(msg)");
        out.println("</script>");
         
                        
                         RequestDispatcher rd=request.getRequestDispatcher("contactmanage.jsp");  
                      rd.include(request, response);
            
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}

      out.write("\n");
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
