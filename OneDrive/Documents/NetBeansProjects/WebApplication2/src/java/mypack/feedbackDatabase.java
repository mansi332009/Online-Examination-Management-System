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


public class feedbackDatabase {
    Connection con ;

    public feedbackDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean savefeedback(feedback f){
        boolean set = false;
        try{
            //Insert register data to database
            String query = ("insert into FEEDBACK(SNAME,ID,EMAIL,EXPERIENCE,SATISFY,SUGGESTION)values(?,?,?,?,?,?)");
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, f.getName());
           pt.setString(2, f.getID());
           pt.setString(3, f.getEmail());
           pt.setString(4, f.getExperience());
           pt.setString(5, f.getSatisfy());
           pt.setString(6, f.getSuggestion());
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
}






