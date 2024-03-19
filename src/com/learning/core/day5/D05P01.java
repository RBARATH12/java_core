package com.learning.core.day5;

import java.util.ArrayList;
import java.util.*;

class Register<T> {

    private ArrayList<T> registrants;

    public Register() {
        this.registrants = new ArrayList<>();
    }

    public void add(T registrant) {
        this.registrants.add(registrant);
    }

    public ArrayList<T> getRegistrants() {
        return registrants;
    }

    public void displayRegistrants() {
        for (T registrant : registrants) {
            System.out.println(registrant.toString());
        }
    }
    public void generateRegisterId() {
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb= new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
        System.out.print(sb);
    }

}

class Employee {

    private String name;
    private int phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;
    private int employeeId;

    public Employee(String name,int phoneNo, int employeeId,String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
        this.employeeId = employeeId;
    }
    public Employee(String name, int phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
        this.employeeId = employeeId;
    }
    public Employee(String name, int phoneNo, int employeeId,int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.voterId = voterId;
        this.employeeId = employeeId;
    }
   
    @Override
    public String toString(){
        return " "+name+" "+phoneNo+" "+passportNo+" "+licenseNo+" "+panCardNo+" "+voterId+" "+employeeId;
    }
}

class Student {

    private String name;
    private int phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;

    public Student(String name, int phoneNo,String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }
    public Student(String name, int  phoneNo,int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }
    public Student(String name, int phoneNo,int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.voterId = voterId;
    }

    @Override
    public String toString() {
        return " "+name+" "+phoneNo+" "+passportNo+" "+licenseNo+" "+panCardNo+" "+voterId;
    }
}

public class D05P01 {
    public static void main(String[] args) {
        Register<Employee> employeeRegister = new Register<>();
        Register<Student> studentRegister = new Register<>();

        // String name;
        // long Ph;
        // int empId;
        // String passNo;
        // String panNo;
        // int LicNo;
        // int VotId;
        // Scanner sc=new Scanner(System.in);
        // String name=sc.next();
       
        Employee emp1 = new Employee("Arun",9123480,110,"LA78833DG");
        Student stu1 = new Student("Joseph",91234780,380,"5JLD1717K");

        employeeRegister.add(emp1);
        studentRegister.add(stu1);

       
        employeeRegister.generateRegisterId();
        employeeRegister.displayRegistrants();

        studentRegister.generateRegisterId();
        studentRegister.displayRegistrants();
    }
   
}

