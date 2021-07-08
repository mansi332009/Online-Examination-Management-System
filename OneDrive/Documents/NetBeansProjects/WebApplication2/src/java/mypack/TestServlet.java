package mypack;
/*
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

/**
 *
 * @author Anjali
 */
public class TestServlet extends HttpServlet {

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
            out.println("<title>Servlet TestoneServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //fetch from registration page
            String test_name = request.getParameter("test_name");
            
           int total_marks= Integer.parseInt(request.getParameter("total_marks"));
           int test_id= Integer.parseInt(request.getParameter("test_id"));
           int test_min= Integer.parseInt(request.getParameter("test_min"));
           int test_sec= Integer.parseInt(request.getParameter("test_sec"));
         Connection conn=null;
               Statement sta = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        sta=conn.createStatement();
          String sql ="select * from test";
          
         rs=sta.executeQuery(sql);
         boolean f=false;
         while(rs.next())
         {
             if(test_id == (rs.getInt(3)))
                 {
                         request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Test ID: Already Exists Insert Again!'");
        out.println("alert(msg)");
        out.println("</script>");
        String req=request.getParameter("teacher_id"); 
                        
                         RequestDispatcher rd=request.getRequestDispatcher("TestReg.jsp?teacher_id="+req);  
                      rd.include(request, response);
                            
       
                      
                         f=true;
                         break;
                 }

         } 
  String req=request.getParameter("teacher_id"); 
  
if(f==false){           
Test st = new Test(test_name,total_marks,test_id,test_min,test_sec);
UserDatabase regTest = new UserDatabase(ConnectionPro.getConnection());
if (regTest.saveTest(st)) {
    request.setAttribute("test_id", st.test_id); 
    request.getRequestDispatcher("choosequestions.jsp?teacher_id="+req& "test_id="+st.test_id).forward(request, response); 
       
} else {
    String errorMessage = "User Available";
    HttpSession regSession = request.getSession();
    regSession.setAttribute("RegError", errorMessage);
    out.println("error");
    response.sendRedirect("TestReg.jsp?teacher_id="+req);
    request.getRequestDispatcher("TestReg.jsp?teacher_id="+req).forward(request, response);
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
