package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADD</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("           ");

               Connection conn=null;
               Statement st = null;
               ResultSet rs = null;
             //  ResultSet ts=null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/tbl_user");
                        st=conn.createStatement();
                        int c=0,s=0;
                        String qry="select * from exam";
                       //  String qery="select * from result";
                        int test_id=Integer.parseInt(request.getParameter("test_no"));
                        rs=st.executeQuery(qry);
                       String st_id = request.getParameter("id");
                      // ts=st.executeQuery(qery);
                      
                    //   if(flag==0){
                        while(rs.next())
                        {
                           // out.println((request.getParameter(rs.getString(1))).toString());
                           // out.print(rs.getString(9).toString());
                            s+=Integer.parseInt(rs.getString(7));
                           if(((request.getParameter(rs.getString(1))).toString()).equals((rs.getString(9)).toString()))
                                c+=Integer.parseInt(rs.getString(7));
                           
                        }
                       
                        PreparedStatement stmt=conn.prepareStatement("insert into result values(?,?,?)");  
                        stmt.setInt(2,test_id);
                        stmt.setString(1,st_id);
                        stmt.setInt(3,c);
                        stmt.executeUpdate();
                        
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                           <p style=\"margin-top:300px;font-family:Lucida Console;font-weight:20px;font-size:20px;color:red;\"> Your score is  ");
      out.print(c);
      out.write("  out of ");
      out.print(s);
      out.write("</p>\n");
      out.write("                        </center>\n");
      out.write("                        ");

                        
                    
                    
                 }
               catch(Exception ex){}
              
      out.write("\n");
      out.write("               \n");
      out.write("                 \n");
      out.write("               \n");
      out.write("    \n");
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
