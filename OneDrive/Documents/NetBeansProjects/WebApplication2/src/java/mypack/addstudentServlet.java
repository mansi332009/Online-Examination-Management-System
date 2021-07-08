package mypack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mansi
 */
public class addstudentServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addstudentServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           //fetch from registration page
            String sname = request.getParameter("sname");
            String uname = request.getParameter("uname");
          String email = request.getParameter("email");
           String id = request.getParameter("id");
           int rno= Integer.parseInt(request.getParameter("rno"));
          String course = request.getParameter("course");
           String password = request.getParameter("password");
           String cpassword = request.getParameter("cpassword");
           
           //make user object
Student st = new Student(sname,uname ,email,id,rno,course,password,cpassword);
            //create a database model
UserDatabase_2 regUser = new UserDatabase_2(ConnectionPro.getConnection());
if (regUser.saveUser(st)) {
    request.setAttribute("alertMsg", "data add sucess");
    String message = (String)request.getAttribute("alertMsg");

    out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Student Added Successfully!  Click OK for admin home page'");
        out.println("alert(msg)");
        out.println("</script>");

   response.sendRedirect("adminpanel.jsp");
} else {
    String errorMessage = "User Available";
    HttpSession regSession = request.getSession();
    regSession.setAttribute("RegError", errorMessage);
    response.sendRedirect("addstudent.jsp");
    }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
