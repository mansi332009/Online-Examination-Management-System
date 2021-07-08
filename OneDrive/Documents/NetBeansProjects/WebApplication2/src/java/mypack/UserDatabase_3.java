/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author Mansi
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDatabase_3 {
    Connection con ;

    public UserDatabase_3(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveUser(Student st){
        boolean set = false;
        try{
            //Insert register data to database
            String query = ("insert into student values(?,?,?,?,?,?,?,?)");
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, st.getName());
           pt.setString(2, st.getUname());
           pt.setString(3, st.getEmail());
           pt.setString(4, st.getId());
           pt.setInt(5, st.getRno());
            pt.setString(6, st.getCourse());
           pt.setString(7, st.getPassword());
           pt.setString(8, st.getCPassword());
            
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    public Student login(String uname, String password){
        Student st=null;
        try{
            String query ="select * from student where uname=? and password=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, uname);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                st = new Student();
               
                st.setName(rs.getString("sname"));
                st.setUname(rs.getString("uname"));
                st.setEmail(rs.getString("email"));
                st.setId(rs.getString("id"));
                st.setRno(rs.getInt("rno"));
                st.setCourse(rs.getString("course"));
                st.setPassword(rs.getString("password"));
                st.setCPassword(rs.getString("cpassword"));
                
            }
            
        }catch(SQLException e){
        }
        return st;
    }
    public boolean updateProfile(Student std)
   {
       boolean f=false;
       try {
          
           String query="update student set sname=? , uname=? ,email=? , course=? , password=? where id=?";
           PreparedStatement p= con.prepareStatement(query);
           p.setString(1,std.getName());
           p.setString(2,std.getUname());
           p.setString(3,std.getEmail());
           p.setString(4,std.getCourse());
           p.setString(5,std.getPassword());
           p.setString(6,std.getId());
           p.executeUpdate();
           f=true;
       }
       catch(SQLException e)
       {
             System.out.println("error");
       }
       return f;
   }
    public boolean updateProfileteacher(Teacher t)
   {
       boolean f=false;
       try {
          
           String query="update teacher set tsname=? , tuname=? ,temail=? , dept=? , tpassword=? where tid=?";
           PreparedStatement p= con.prepareStatement(query);
           p.setString(1,t.getTName());
           p.setString(2,t.getTUname());
           p.setString(3,t.getTEmail());
           p.setString(4,t.getDept());
           p.setString(5,t.getTPassword());
           p.setString(6,t.getTId());
           p.executeUpdate();
           f=true;
       }
       catch(SQLException e)
       {
             System.out.println("error");
       }
       return f;
   }
}



