package mypack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mansi
 */
public class Exam {
    
int qid;
String qname,op1,op2, op3, op4;
int total_marks,test_id;
String correct_ans;
   

    public Exam() {
    }

   
    public Exam(int qid,String qname,String op1,String op2,String op3,String op4,int total_marks,int test_id,String correct_ans) {
       this. qid=qid;
      this.qname=qname;
      this.op1=op1;
       this.op2=op2;
       this.op3=op3;
       this.op4=op4;
       this. total_marks=total_marks;
       this.correct_ans=correct_ans;

 this. test_id=test_id;
    }

    public int getqid() {
        return qid;
    }

    public void setqid(int qid) {
        this.qid=qid;
    }
 
    public String getqname() {
        return qname;
    }

    public void setqname(String qname) {
        this.qname=qname;
    }

    public String getop1(){
        return op1;
    }
    public String getop2(){
        return op2;
    }
    public String getop3(){
        return op3;
    }
    public String getop4(){
        return op4;
    }

    public void setop1(String op1) {
        this.op1=op1;
    }
   
     public void setop2(String op2) {
        this.op2=op2;
    }
      public void setop3(String op3) {
        this.op3=op3;
    }
       public void setop4(String op4) {
        this.op4=op4;
    }
    public int gettotalmarks() {
        return total_marks;
    }

    public void settotalmarks(int total_marks) {
        this.total_marks = total_marks;
    }
    public int gettestid() {
        return test_id;
    }

    public void settestid(int test_id) {
        this.test_id = test_id;
    }
    
    public String getcorrectans(){
        return correct_ans;
    }

    public void setcorrectans(String correct_ans) {
        this.correct_ans=correct_ans;
    }
}


