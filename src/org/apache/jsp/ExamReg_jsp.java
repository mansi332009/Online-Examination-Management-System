package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class ExamReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
Class.forName("org.apache.derby.jdbc.ClientDriver");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Add Questions Form</title>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("         <style type=\"text/css\">\n");
      out.write("             \n");
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
      out.write("            overflow: visible;\n");
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
      out.write("  background-color: black;\n");
      out.write("}\n");
      out.write("form{\n");
      out.write("    margin-top: 50px;\n");
      out.write("}\n");
      out.write("    form .user-details .input-box{\n");
      out.write("        margin-bottom:10px;\n");
      out.write("        width:50%;\n");
      out.write("    }\n");
      out.write("    form .gender-details .category{\n");
      out.write("        width:50%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form .user-details .input-box{\n");
      out.write("    margin-bottom:15px;\n");
      out.write("    width:40%;    \n");
      out.write("}\n");
      out.write(".user-details .input-box .details{\n");
      out.write("    font-weight:500;\n");
      out.write("    margin-bottom:5px;\n");
      out.write("    display:block;\n");
      out.write("}\n");
      out.write(".user-details .input-box input{\n");
      out.write("    height:45px;\n");
      out.write("    width:50%;\n");
      out.write("    outline:none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    border:1px solid #ccc;\n");
      out.write("    padding-left:15px;\n");
      out.write("    font-size:16px;\n");
      out.write("    border-bottom-width:2px;\n");
      out.write("    transition: all 0.3s ease;\n");
      out.write("}\n");
      out.write(".user-details .input-box input:focus,.user-details .input-box input:valid{\n");
      out.write("    border-color:#9b59b5;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form input[type=\"radio\"]{\n");
      out.write("    display:none;\n");
      out.write("}\n");
      out.write("form .button{\n");
      out.write("    height: 45px;\n");
      out.write("    margin:45px 0;\n");
      out.write("}\n");
      out.write("form .button input{\n");
      out.write("    height:100%;\n");
      out.write("    width:20%;\n");
      out.write("    outline:none;\n");
      out.write("    color:#fff;\n");
      out.write("    border:none;\n");
      out.write("    font-size:18px;\n");
      out.write("    font-weight: 500;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("    border-radius: 5PX;\n");
      out.write("    background:#a62c2b ;\n");
      out.write("}\n");
      out.write("form .button input:hover{\n");
      out.write("    background:black ;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("    text-decoration:none;\n");
      out.write("    color: black;\n");
      out.write("    font-size: 16px;\n");
      out.write("    line-height: 20px;\n");
      out.write("    margin: 0;\n");
      out.write("    margin-left:25px;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("title{\n");
      out.write("                 font-size: 40px;\n");
      out.write("             }\n");
      out.write("    </style>\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>   \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <center><img src=\"teacher2.jpg\" alt=\"teachericon\" id=\"image\"></center>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div class=\"main-content\">\n");
      out.write("            <div class=\"sidebar\">\n");
      out.write("                <p>ONLINE</br>EXAM</p>\n");
      out.write("                <ul>\n");
      out.write("            \n");
      out.write("             <li><a href=\"TestReg.jsp?teacher_id=");
      out.print(request.getParameter("teacher_id"));
      out.write("\">Create Exam</a></li>\n");
      out.write("            <li><a href=\"result_teacher.jsp?teacher_id=");
      out.print(request.getParameter("teacher_id"));
      out.write("\">View Result</a></li>\n");
      out.write("            <li><a href=\"studentdetail_teacher.jsp?teacher_id=");
      out.print(request.getParameter("teacher_id"));
      out.write("\">View Student Detail</a></li>\n");
      out.write("            <li><a href=\"teacher_profile.jsp?teacher_id=");
      out.print(request.getParameter("teacher_id"));
      out.write("\"> Edit Profile</a></li>\n");
      out.write("             <li><a type=\"button\" onclick=\"myfunc()\">LogOut</a></li>\n");
      out.write("             \n");
      out.write("</ul>\n");
      out.write("            </div>     \n");
      out.write("       <div class=\"content\" align=\"center\"> \n");
      out.write("            \n");
      out.write("            <form action=\"ExamServlet\" method=\"post\">\n");
      out.write("              <input type=\"text\" name=\"test_id\" value=");
      out.print(request.getParameter("test_id"));
      out.write(" style=\"display:none\">\n");
      out.write("                <div class=\"user-details\" >\n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Question ID:\n");
      out.write("                        <input type=\"number\" placeholder=\" Enter Question ID\" name=\"qid\" required></span>            \n");
      out.write("                </div>\n");
      out.write("                 <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Question Marks:\n");
      out.write("                        <input type=\"number\"   placeholder=\"Enter total marks\" name=\"total_marks\" required></span>    \n");
      out.write("                </div> \n");
      out.write("                    \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Question:\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Question\" name=\"qname\" required></span>            \n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Option 1: \n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Option 1\" name=\"op1\" required></span>    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                     \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Option 2:\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Option 2\" name=\"op2\" required></span>    \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("                    <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Option 3:\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Option 3\" name=\"op3\" required></span>    \n");
      out.write("                </div>     \n");
      out.write("                \n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Option 4:\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Option 4\" name=\"op4\" required></span>   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Enter Correct Ans:\n");
      out.write("                        <input type=\"text\" placeholder=\" Enter Correct Ans\" name=\"correct_ans\" required></span>    \n");
      out.write("                </div>\n");
      out.write("                   <div class=\"input-box\">\n");
      out.write("                        <span class=\"details\">Please Enter Test ID Again:\n");
      out.write("                         <input type=\"number\" placeholder=\" Enter Test ID:\" name=\"test_id\" required></span>  \n");
      out.write("                </div>   \n");
      out.write("        </div>        \n");
      out.write("       \n");
      out.write("        <div class=\"button\">\n");
      out.write("            <input type=\"submit\"  value=\"Create\">\n");
      out.write("            <a href=\"successfull.jsp\"></a>\n");
      out.write("        </div>\n");
      out.write("            </form>\n");
      out.write("       </div>         \n");
      out.write("                \n");
      out.write("           <script type=\"text/javascript\">\n");
      out.write("                function myfunc(){\n");
      out.write("                      if(window.confirm(\"Forwarding to Home page\")===true)\n");
      out.write("                          window.location.replace(\"index.html\");\n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                         \n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   </script>       \n");
      out.write("           \n");
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