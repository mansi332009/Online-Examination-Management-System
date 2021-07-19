package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"style_home_project.css\">\n");
      out.write("\t<script defer src=\"script.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t</head>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("       <body>\n");
      out.write("\t\t\t<div><img  src=\"img_project_logo\"  alt=\"seminar\"></div>\n");
      out.write("\t\t\t<div id=\"nav\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("                            \n");
      out.write("  \t\t\t\t\t<a class=\"btn2\" href=\"Login.jsp\" style=\"margin-left:30px;margin-top:-10px;background-color:red;\">Give Exam</a>\n");
      out.write("                                        <a  href=\"Login.jsp\"class=\"btn2\" style=\"margin-left:30px;margin-top:-10px;\">Create Exam</a>\n");
      out.write("\t\t\t\t\t<li><a href=\"RegCheack.jsp\">Register</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Contact us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Covid Resources</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container1\">\n");
      out.write("\t\t\t<div class=\"row1 col-6\">\n");
      out.write("\t\t\t\t\t<p style=\"font-size:60px;\">The exam online that's easy to use, fun and fully customizable</p>\n");
      out.write("\t\t\t\t\t<p style=\"font-size:20px;padding-bottom:30px;\">Create a exam to test your students skills , no matter how much distant you are.</p>\n");
      out.write("\t\t\t\t\t<a href=\"Login.jsp\" class=\"btn2\" style=\"margin-left:30px;margin-top:-10px;margin-bottom:100px;\">Create Exam</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row1 col-6\" style=\"padding-left:150px;\">\n");
      out.write("\t\t\t\t\t<p style=\"font-size:60px;\">If you are here to Give Test , Go to the below Button . Best Of Luck!!!!</p>\n");
      out.write("\t\t\t\t\t<p style=\"font-size:20px;padding-bottom:30px;\">No matter how far you are from your institute , we provide you a complete exam fear </p>\n");
      out.write("\t\t\t\t\t<a href=\"Login.jsp\" class=\"btn2\" style=\"margin-left:30px;margin-top:-10px;background-color:red;margin-bottom:100px;\">Give Exam</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"quiz_tour\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div id=\"question-container\" class=\"hide\">\n");
      out.write("\t\t\t\t\t<div id=\"question\">Question</div>\n");
      out.write("\t\t\t\t\t<div id=\"answer-buttons\" class=\"btn-grid\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn\">Answer 1</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn\">Answer 2</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn\">Answer 3</button>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn\">Answer 4</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t<button id=\"start-btn\" class=\"start-btn btn\">Start The Sample Test</button>\n");
      out.write("\t\t\t\t\t\t<button id=\"next-btn\" class=\"next-btn btn hide\">Next</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"container2\">\n");
      out.write("\t\t\t\t<div class=\"heading\">How to create an online quiz with OnlineExam</div>\n");
      out.write("\t\t\t\t<p class=\"content\">Don’t know how to code and want to make your own quiz? You’ll need an online tool to do so.\n");
      out.write("\t\t\t\tWith OnlineExam you can create something that is beautiful, mobile-friendly, and effortless.\n");
      out.write("\t\t\t\tLooking to make a test? Take a look at our test maker.</br></br>Here are tips on how to build a seamless OnlineExam \n");
      out.write("\t\t\t\t that will rock your audience’s socks off.</p>\n");
      out.write("\t\t\t\t<div class=\"key\">Quiz Your Students, not strangers</div>\n");
      out.write("\t\t\t\t<p class=\"content\">If you want people to be engaged with your content, treat them like a friend.\n");
      out.write("\t\t\t\tTo personalize your quiz, use OnlineExam to address people by name throughout. Make your quiz takers feel welcome.</p>\n");
      out.write("\t\t\t\t<div class=\"key\">Give them feedback as they go</div>\n");
      out.write("\t\t\t\t<p class=\"content\">If your quiz taker is doing well, why not give them a thumbs up? Or if they’re having a hard time,\n");
      out.write("\t\t\t\twhy not a word of encouragement or guiding hand? With Logic Jump (a PRO feature), you can support them in unique ways—all based on their answers.</p>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"key\">Deliver an experience</div>\n");
      out.write("\t\t\t\t<p class=\"content\">Have you ever given up reading or doing something because it was presented without charm, effort, or both? \n");
      out.write("\t\t\t\tThankfully it doesn’t take much to design a better experience.Break boredom with images, GIFs, and videos. Don’t be afraid to mix it up.\n");
      out.write("\t\t\t\tVariety is the spice of life—same goes for quizzes.</p>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"key\">Works anywhere</div>\n");
      out.write("\t\t\t\t<p class=\"content\">Now that you have a gorgeous quiz to share, it would be a shame if it didn’t always keep up appearances.\n");
      out.write("\t\t\t\tThankfully OnlineExam look equally great on desktops, mobiles, and tablets alike.</p>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footer\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" style=\"margin-left:300;\">About Us</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Covid Resources</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-facebook\" style=\"margin-left:80px;\"></a>  \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-twitter\"></a>  \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-pinterest\"></a>  \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-linkedin\"></a> \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-instagram\"></a>  \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-youtube\"></a> \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-google\"></a> \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-snapchat-ghost\"></a>  \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"fa fa-skype\"></a></li>\n");
      out.write("\t\t\t\t\t\t<p class=\"copyright\">&copy OnlineExam </p>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
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
