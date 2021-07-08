package mypack;
import static java.lang.System.out;
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


public class UserDatabase {
    Connection con ;

    public UserDatabase(Connection con) {
        this.con = con;
    }
    
     
    public boolean saveTest(Test st){
        boolean set = false;
        try{
            
           
          
              String query = ("insert into test(test_name,total_marks,test_id,test_min,test_sec)values(?,?,?,?,?)");
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, st.gettestname());
           pt.setInt(2, st.gettotalmarks());
           pt.setInt(3, st.gettestid());
           pt.setInt(4, st.gettesmin());
           pt.setInt(5, st.gettestsec());
           
           
           pt.executeUpdate();
           set = true;
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
   
}



