
package mypack;


import mypack.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anjali
 */
public class LoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String logusername = request.getParameter("uname");
            String logpass = request.getParameter("password");
            String Tlogusername = request.getParameter("uname");
            String Tlogpass = request.getParameter("password");
            String adusername=request.getParameter("uname");
             String adpass = request.getParameter("password");
            
            UserDatabase_2 db =  new UserDatabase_2(ConnectionPro.getConnection());
            Student std = db.login(logusername, logpass);
            TeacherDatabase t =  new TeacherDatabase(ConnectionPro.getConnection());
            Teacher t1 = t.loginT(Tlogusername, Tlogpass);
           admindatabase a =  new admindatabase(ConnectionPro.getConnection());
            admin am = a.loginA(adusername, adpass);
            
           // if(st!=null){
           //     HttpSession session = request.getSession();
            //    session.setAttribute("logUser", st);
           //     response.sendRedirect("student_after_login.jsp");
          //  }
          //  else {if(t1!=null){
          //      HttpSession session = request.getSession();
          //      session.setAttribute("logUser", t1);
           //     response.sendRedirect("TeacherWelcome.jsp");
           if(std!=null){
                HttpSession session = request.getSession();
                session.setAttribute("std",std);
             // session.setAttribute("logUser",std);
              //  request.getRequestDispatcher("exam_project.jsp").forward(request, response);
                response.sendRedirect("student_aftr_login.jsp?st_id="+std.id);
          //   response.sendRedirect("student_aftr_login.jsp");
            }
           // else{ out.println("user not found");}
          else if(t1!=null){
                  HttpSession session = request.getSession();
              session.setAttribute("t1", t1);
               response.sendRedirect("TeacherWelcome.jsp?teacher_id="+t1.Tid);
           }
           else if(am!=null){
                HttpSession session = request.getSession();
                session.setAttribute("logUser", am);
                response.sendRedirect("adminpanel.jsp");
            }
            else{
                request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'User Not Exists Insert Again!'");
        out.println("alert(msg)");
        out.println("</script>");
            }
            out.println("</body>");
            out.println("</html>");
            
          RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
                      rd.include(request, response);  
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