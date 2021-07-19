package mypack;
import mypack.*;
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

/**
 *
 * @author Anjali
 */
public class RegisterServlet extends HttpServlet {

      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //fetch from registration page
            String name = request.getParameter("sname");
            String uname = request.getParameter("uname");
          String email = request.getParameter("email");
           String id = request.getParameter("id");
           int rno= Integer.parseInt(request.getParameter("rno"));
          String course = request.getParameter("course");
           String password = request.getParameter("password");
           String cpassword = request.getParameter("cpassword");
           
          Connection conn=null;
               Statement sta = null;
               ResultSet rs = null;
               try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/student");
                        sta=conn.createStatement();
                        String sql ="select * from student";
          
                        rs=sta.executeQuery(sql);
                         boolean f=false;
                           while(rs.next())
         {
                 if(uname.equals(rs.getString(2))||email.equals(rs.getString(3))||id.equals(rs.getString(4))||rno==(rs.getInt(5)))
                 {
                     request.setAttribute("alertMsg", "data add sucess");
                         String message = (String)request.getAttribute("alertMsg");
                            out.println("<script type=\'text/javascript\'>");
        out.println("var msg = 'Student : Already Exists Insert Again!'");
        out.println("alert(msg)");
        out.println("</script>");
   
                        
                         RequestDispatcher rd=request.getRequestDispatcher("StudentReg.jsp");  
                      rd.include(request, response);
                                                  f=true;
                                                  
                         break;
                 }

         } 

            if(f==false){          //make user object
 Student st = new Student(name,uname ,email,id,rno,course,password,cpassword );
            //create a database model
UserDatabase_2 regUser = new UserDatabase_2(ConnectionPro.getConnection());
if (regUser.saveUser(st)) {
   response.sendRedirect("Login.jsp");
} else {
    String errorMessage = "User Available";
    HttpSession regSession = request.getSession();
    regSession.setAttribute("RegError", errorMessage);
    response.sendRedirect("StudentReg.jsp");
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

