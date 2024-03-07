package com.learning.core.day4;

import java.lang.Exception;
import java.util.Scanner;

public class D04P01 {
    int accNo;
    String custName;
    String accType;
    float balance;

    // Constructor to initialize account details
    public D04P01(int accNo, String custName, String accType, float initialBalance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }
        else{
        balance += amt;
        
        }
    }

    // Method to get balance
    public float getBalance() throws LowBalanceException {
        if (accType.equals("Saving") && balance < 1000) {
            throw new LowBalanceException("LowBalance");
        } else if (accType.equals("Current") && balance < 5000) {
            throw new LowBalanceException("LowBalance");
        }
        return balance;
    }

    // Custom exceptions for negative amount and low balance
    class NegativeAmountException extends Exception {
        public NegativeAmountException(String message) {
            super(message);
        }
    }

    class LowBalanceException extends Exception {
        public LowBalanceException(String message) {
            super(message);
        }
    }
   
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            s.nextLine(); // Consume newline character
            String name = s.nextLine();
            String type = s.nextLine();
            float bal = s.nextFloat();
           
           
            D04P01 B1 = new D04P01(num,name,type,bal);
            B1.deposit(bal);
            System.out.println(B1.getBalance());
       
        } catch (NegativeAmountException e) {
            System.err.println(e.getMessage());
        } catch (LowBalanceException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}


	  