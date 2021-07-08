package mypack;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mypack.ConnectionPro;
import mypack.Teacher;
import mypack.TeacherDatabase;

/**
 *
 * @author Anjali
 */
public class TeacherServlet extends HttpServlet {

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
            out.println("<title>Servlet Teacherserverlet</title>");            
            out.println("</head>");
            out.println("<body>");
              String Tname = request.getParameter("tsname");
            String Tuname = request.getParameter("tuname");
          String Temail = request.getParameter("temail");
           String Tid= request.getParameter("tid");
          
          String dept = request.getParameter("dept");
           String Tpassword = request.getParameter("tpassword");
           String Tcpassword = request.getParameter("tcpassword");
           Connection conn=null;
               Statement sta = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        sta=conn.createStatement();
                        String sql ="select * from teacher";
          
                        rs=sta.executeQuery(sql);
                         boolean f=false;
                           while(rs.next())
         {
                 if(Tuname.equals(rs.getString(2))||Temail.equals(rs.getString(3))||Tid.equals(rs.getString(4)))
                 {
                         request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Teacher : Already Exists Insert Again!'");
        out.println("alert(msg)");
        out.println("</script>");
   
                        
                         RequestDispatcher rd=request.getRequestDispatcher("TeacherReg.jsp");  
                      rd.include(request, response);
                                                  f=true;
                                                  
                         break;
                 }

         } 

            if(f==false){    
           
           //make user object
Teacher t = new Teacher(Tname,Tuname ,Temail,Tid,dept,Tpassword,Tcpassword);
            //create a database model
TeacherDatabase regUser = new TeacherDatabase(ConnectionPro.getConnection());
if (regUser.saveTech(t)) {
   response.sendRedirect("Login.jsp");
} else {
    String errorMessage = "User Available";
    HttpSession regSession = request.getSession();
    regSession.setAttribute("RegError", errorMessage);
    response.sendRedirect("TeacherReg.jsp");
    }

          }       
               }catch(IOException | ClassNotFoundException | SQLException e){}  
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
