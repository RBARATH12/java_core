package com.learning.core.day4;

import java.util.Scanner;


import java.util.Scanner;
public class D04P03 {
    String applicantName;
    String postApplied;
    int applicantAge;

    public D04P03(String name, String post, int age) {
        this.applicantName = name;
        this.postApplied = post;
        this.applicantAge = age;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public void setPostApplied(String postApplied) {
        this.postApplied = postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }
  public static class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
  }
   
  public static class Validator {
    public boolean validate(D04P03 applicant) throws CatheyBankException {
        boolean ans;
        if (!validateApplicantName(applicant.getApplicantName())) {
            throw new CatheyBankException("Invalid Applicant Name");
        }else {
          ans=true;
        }
        if (!validatePost(applicant.getPostApplied())) {
            throw new CatheyBankException("Invalid Post");
        }else {
            ans=true;
        }
        if (!validateAge(applicant.getApplicantAge())) {
            throw new CatheyBankException("Invalid Age");
        } else {
            ans=true;
        }
        return ans;
    }

    private boolean validateApplicantName(String applicantName) {
        return applicantName != null && !applicantName.isEmpty();
    }

    private boolean validatePost(String post) {
        return post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
    }

    private boolean validateAge(int age) {
        return age<30 && age>18;
    }
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String applicantName;
        String postApplied;
        int applicantAge;

        applicantName = sc.next();
        if ((applicantName.equals("ProbationaryOfficer")||applicantName.equals("SpecialCadreOfficer")||
        applicantName.equals("Assistant"))&& sc.hasNextInt()) {
            postApplied = applicantName;
            applicantName = "";
            applicantAge = sc.nextInt();
        }else{
        postApplied = sc.next();
        applicantAge = sc.nextInt();
        }

        D04P03 applicant = new  D04P03(applicantName, postApplied, applicantAge);
        Validator validator = new Validator();

        try {
            if (validator.validate(applicant)) {
              System.out.println("Valid Application");
            }
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }
    }
}
