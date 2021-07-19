package mypack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
public class Teacher {
    
    String Tid;
    String Tsname;
    String Tuname;
    String Temail;
    String dept;
    String Tpassword;
    String Tcpassword;
    

    public Teacher() {
    }

   
    public Teacher( String Tsname,String Tuname, String Temail,String Tid, String dept ,String Tpassword,String Tcpassword) {
       
        this.Tsname = Tsname;
        this.Tuname = Tuname;
        this.Tid = Tid;
        this.Temail = Temail;
        this.dept=dept;
        this.Tpassword = Tpassword;
        this.Tcpassword=Tcpassword;
    }

     public Teacher(String Tuname, String Tpassword) {
        this.Tuname = Tuname;
        this.Tpassword = Tpassword;
    }

    
    
    public String getTName() {
        return Tsname;
    }

    public void setTName(String Tsname) {
        this.Tsname = Tsname;
    }
    public String getTUname() {
        return Tuname;
    }

    public void setTUname(String Tuname) {
        this.Tuname = Tuname;
    }

    public String getTEmail() {
        return Temail;
    }

    public void setTEmail(String Temail) {
        this.Temail = Temail;
    }
    public String getTId() {
        return Tid;
    }

    public void setTId(String Tid) {
        this.Tid = Tid;
    }
    
public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getTPassword() {
        return Tpassword;
    }

    public void setTPassword(String Tpassword) {
        this.Tpassword = Tpassword;
    }
    public String getTCPassword() {
        return Tcpassword;
    }

    public void setTCPassword(String Tcpassword) {
        this.Tcpassword = Tcpassword;
    }
    
   
 
    
}





