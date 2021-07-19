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
public class feedbackservlet extends HttpServlet {

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
            out.println("<title>Servlet feedbackservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String sname = request.getParameter("SNAME");
          String id = request.getParameter("ID");
          String email = request.getParameter("EMAIL");
           String experience = request.getParameter("EXPERIENCE");
          String satisfy = request.getParameter("SATISFY");
           String suggestion = request.getParameter("SUGGESTION");
           
           //make user object
feedback f = new feedback(sname,id,email,experience,satisfy,suggestion);
            //create a database model
feedbackDatabase regUser = new feedbackDatabase(ConnectionPro.getConnection());
if (regUser.savefeedback(f)) {
   response.sendRedirect("feedbacksubmit.jsp");
} else {
    String errorMessage = "User Available";
    HttpSession regSession = request.getSession();
    regSession.setAttribute("RegError", errorMessage);
    response.sendRedirect("Feedback.jsp");
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
