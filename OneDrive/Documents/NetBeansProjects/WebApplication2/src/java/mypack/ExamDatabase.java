package mypack;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mansi
 */


public class ExamDatabase {
    Connection con ;

    public ExamDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveQuestions(Exam st){
        boolean set = false;
        try{  
            
            
           String query = ("insert into exam(q_id,question,option_1,option_2,option_3,option_4,total_marks,test_id,correct_ans)values(?,?,?,?,?,?,?,?,?)");
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setInt(1, st.getqid());
           pt.setString(2,st.getqname());
           pt.setString(3,st.getop1());
           pt.setString(4,st.getop2());
           pt.setString(5,st.getop3());
           pt.setString(6,st.getop4());
               
           pt.setInt(7, st.gettotalmarks());
          
            pt.setInt(8,st.gettestid());
            pt.setString(9,st.getcorrectans());
            
           
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
   /* public Student login(String uname, String password){
        Student st=null;
        try{
            String query ="select *from student where uname=? and password=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, uname);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                st = new Student();
               
                st.setName(rs.getString("sname"));
                st.setEmail(rs.getString("uname"));
                st.setEmail(rs.getString("email"));
                st.setId(rs.getString("id"));
                st.setRno(rs.getInt("rno"));
                st.setCourse(rs.getString("course"));
                st.setPassword(rs.getString("password"));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return st;
    }
*/

    private int getqmarks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}




