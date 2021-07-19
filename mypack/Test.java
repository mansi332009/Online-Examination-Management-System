
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mansi
 */
public class Test {
    

    String test_name;
    int total_marks;
    int test_id;
    int test_min;
int test_sec;
    public Test() {
    }

   
    public Test(String test_name,int total_marks,int test_id,int test_min,int test_sec) {
       
    this.test_name=test_name;
    this.total_marks=total_marks;
    this.test_id=test_id;
    this.test_min=test_min;
    this.test_sec=test_sec;
        
    }

    public String gettestname() {
        return test_name;
    }

    public void settestname(String test_name) {
        this.test_name = test_name;
    }
    public int gettotalmarks() {
        return total_marks;
    }

    public void settotalmarks(int total_marks) {
        this.total_marks=total_marks;
    }

    public int gettestid(){
        return test_id;
    }

    public void settestid(int test_id) {
        this.test_id=test_id;
    }
    public int gettesmin(){
        return test_min;
    }

    public void settestmin(int test_min) {
        this.test_min=test_min;
    }
    public int gettestsec(){
        return test_sec;
    }

    public void settestsec(int test_sec) {
        this.test_sec=test_sec;
    }
}

