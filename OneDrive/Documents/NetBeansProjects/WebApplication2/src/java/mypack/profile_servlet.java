/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mansi
 */
public class profile_servlet extends HttpServlet {

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
            out.println("<title>Servlet profile_servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String sname=request.getParameter("sname");
            String uname=request.getParameter("uname");
            String email=request.getParameter("email");
            String id=request.getParameter("id");
            String dept=request.getParameter("dept");
            String password=request.getParameter("password");
            HttpSession s= request.getSession();
            Teacher teacher=(Teacher) s.getAttribute("t1");
            teacher.setTEmail(email);
            teacher.setDept(dept);
            teacher.setTId(id);
            teacher.setTName(sname);
            teacher.setTPassword(password);
            teacher.setTUname(uname);
          //  out.println(student.rno);
            UserDatabase_2 db =  new UserDatabase_2(ConnectionPro.getConnection());
            boolean ans=db.updateProfileteacher(teacher);
        
            
            
            if(ans)
                out.println("updated user");
            else
            {
                out.println("not updated");
            }
            out.println("</body>");
            out.println("</html>");
        }catch(Exception ex){ 
            out.println("not updated");
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
