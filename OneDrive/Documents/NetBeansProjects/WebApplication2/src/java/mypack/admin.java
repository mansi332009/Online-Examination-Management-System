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
public class admin {
    
    
   
    String auname;
    String apass;
    String aname;
    

    public admin() {
    }

   
    public admin ( String aname,String auname ,String apass) {
       
        
        this.aname= aname;
        this.auname=auname;
        this.apass =apass;
        
        
    }

    

    public admin(String auname, String apass) {
        this.auname = auname;
        this.apass = apass;
    }

    
    
    public String getUname() {
        return auname;
    }

    public void setUname(String auname) {
        this.auname = auname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }


    
    public String getPassword() {
        return apass;
    }

    public void setPassword(String apass) {
        this.apass = apass;
    }
    
   
 
    
}






