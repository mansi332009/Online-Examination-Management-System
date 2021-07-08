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


public class contactDatabase {
    Connection con ;

    public contactDatabase(Connection con) {
        this.con = con;
    }
    
    //for register user 
    public boolean savecontact(contact  c1){
        boolean set = false;
        try{
            //Insert register data to database
            String query = ("insert into contactus(sname,email,messagesub,message,utype)values(?,?,?,?,?)");
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, c1.getName());
           
           pt.setString(2, c1.getEmail());
           pt.setString(3, c1.getmessagesub());
           pt.setString(4, c1.getmessage());
           pt.setString(5,c1.getUtype());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
    
}