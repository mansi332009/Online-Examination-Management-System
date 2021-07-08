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


public class admindatabase {
    Connection con ;

    public admindatabase(Connection con) {
        this.con = con;
    }
    public admin loginA(String auname, String apass){
        admin am=null;
        try{
            String query ="select * from admin where auname=? and apass=?";
            PreparedStatement pst = this.con.prepareStatement(query);
            pst.setString(1, auname);
            pst.setString(2, apass);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                am =new admin();
               
               
                am.setUname(rs.getString("auname"));
                am.setAname(rs.getString("aname"));
                am.setPassword(rs.getString("apass"));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return am;
    }

}










