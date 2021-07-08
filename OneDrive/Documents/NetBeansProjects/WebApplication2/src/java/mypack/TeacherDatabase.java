package mypack;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TeacherDatabase {
    
   
    Connection con ;

    public TeacherDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean saveTech(Teacher t){
        boolean set = false;
        try{
            //Insert register data to database
            String query = ("insert into Teacher(Tsname,Tuname,Temail,Tid,dept,Tpassword,TCPASSWORD)values(?,?,?,?,?,?,?)");
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, t.getTName());
           pt.setString(2, t.getTUname());
           pt.setString(3, t.getTEmail());
           pt.setString(4, t.getTId());
            pt.setString(5, t.getDept());
           pt.setString(6, t.getTPassword());
           pt.setString(7, t.getTCPassword());
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    public Teacher loginT(String Tuname, String Tpassword){
        Teacher t=null;
        try{
            String query ="select * from teacher where tuname=? and tpassword=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, Tuname);
            pst.setString(2, Tpassword);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                t = new Teacher();
               
                t.setTName(rs.getString("tsname"));
                t.setTUname(rs.getString("tuname"));
                t.setTEmail(rs.getString("temail"));
                t.setTId(rs.getString("tid"));
                t.setDept(rs.getString("dept"));
                t.setTPassword(rs.getString("tpassword"));
                t.setTCPassword(rs.getString("tcpassword"));
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return t;
    }
public boolean updateProfile(Teacher std)
   {
       boolean f=false;
       try {
          
           String query="update TEACHER set TSNAME=? , TUNAME=? TEMAIL=? , DEPT=? , TPASSWORD=? where TID=?";
           PreparedStatement p= con.prepareStatement(query);
          p.setString(1, std.getTName());
           p.setString(2, std.getTUname());
           p.setString(3, std.getTEmail());
            p.setString(4, std.getDept());
           p.setString(5, std.getTPassword());
           p.setString(6, std.getTId());
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
















