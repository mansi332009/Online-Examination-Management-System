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
public class contact {
    
    
    String sname;
    
    String semail;
    String messagesub;
    String message;
    String utype;
    

    public contact() {
    }

   
    public contact( String sname, String semail,String messagesub, String message,String utype) {
       
        this.sname = sname;
        this.semail = semail;
        this.messagesub=messagesub;
        this.message =message;
        this.utype= utype;
    }
    public String getName() {
        return sname;
    }

    public void setName(String sname) {
        this.sname = sname;
    }
    
    public String getEmail() {
        return semail;
    }

    public void setEmail(String semail) {
        this.semail = semail;
    }
    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
    public String getmessagesub() {
        return messagesub;
    }

    public void setmessagesub(String messagesub) {
        this.messagesub = messagesub;
    }
    
public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }
    
   
 
    
}




