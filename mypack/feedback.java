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
public class feedback {
    
    String sname;
    String id;
    String email;
    String satisfy;
    String experience;
    String suggestion;
    

    

   
    public feedback( String sname,String id,String email,String experience ,String satisfy, String suggestion) {
       
        this.sname = sname;
        this.id=id;
        this.email = email;
        this.satisfy=satisfy;
        this.suggestion=suggestion;
        this.experience=experience;
    }
     
    public String getName() {
        return sname;
    }

    public void setName(String sname) {
        this.sname = sname;
    }
    public String getID() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
    public String getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(String satisfy) {
        this.satisfy = satisfy;
    }
    
public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    } 
}




