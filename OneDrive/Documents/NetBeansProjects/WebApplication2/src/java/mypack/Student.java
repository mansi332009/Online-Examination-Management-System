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
public class Student {
    String id;
    String sname;
    String uname;
    String email;
    String course;
    String password;
     String cpassword;
    int rno;

    public Student() {
    }

   
    public Student( String sname,String uname, String email,String id,int rno, String course, String password,String cpassword) {
       
        this.sname = sname;
        this.uname = uname;
        this.id = id;
        this.email = email;
        this.rno=rno;
        this.course=course;
        this.password = password;
        this.cpassword = cpassword;
        
    }

    

    public Student(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    
    public String getName() {
        return sname;
    }

    public void setName(String sname) {
        this.sname = sname;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno =rno;
    }
public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getCPassword() {
        return cpassword;
    }

    public void setCPassword(String cpassword) {
        this.cpassword = cpassword;
    }
    
   
 
    
}







