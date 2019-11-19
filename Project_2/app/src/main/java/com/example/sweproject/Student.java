package com.example.sweproject;


public class Student {

    private  int studentID;
    private String studentName;
    private String number;
    private String email;
    private String emergancyContact;

    // constructors
    public Student() {}
    public Student(int studentID, String studentname ,String number,String email,String emergancyContact) {
        this.studentID = studentID;
        this.studentName = studentname;
        this.number=number;
        this.email=email;
        this.emergancyContact=emergancyContact;
    }
    // properties


    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentName(String studentname) {
        this.studentName = studentname;
    }
    public String getStudentName() {
        return this.studentName;
    }

    public void setNumber(String number){
        this.number=number;

    }
    public String getNumber(){
        return this.number;

    }
    public void setEmail(String email){
        this.email=email;

    }
    public String getEmail(){
        return this.email;

    }
    public void setEContact(String emergancyContact){
        this.emergancyContact=emergancyContact;

    }
    public String getEContact(){
        return this.emergancyContact;

    }

}