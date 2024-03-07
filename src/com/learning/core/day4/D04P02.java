package com.learning.core.day4;

import java.util.Scanner;
class D04P02 {
    public String playerName;
    public float critic1;
    public float critic2;
    public float critic3;
    public float avgRating;
    public String coins;

    // Constructor with two critics
    public D04P02(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = 0;
        this.calculateAverageRating();
        this.calculateCoins();
    }

    // Constructor with three critics
    public D04P02(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        this.calculateAverageRating();
        this.calculateCoins();
    }
     
    class NotEligibleException extends Exception {
    String message;
    public NotEligibleException(String message) {
        this.message="Not eligible";
    }
}
    // Method to calculate average rating based on two critics
    public void calculateAverageRating() {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    // Method to calculate coins based on average rating
    public void calculateCoins() {
        if (avgRating >= 7)
            coins = "Gold";
        else if (avgRating >= 5)
            coins = "Silver";
        else if (avgRating >= 2)
            coins = "Copper";
        else
            try {
                throw new NotEligibleException("Not eligible");
            } catch (NotEligibleException e) {
                System.out.print(e.message+"\n");
            }
        if(avgRating>=2){
            this.display();
        }
    }

    // Method to display player information
    public void display() {
        System.out.println(playerName+" "+avgRating+" "+coins);
    }

// Tester class to demonstrate the usage of CricketRating class
    public static void main(String[] args){
            // Creating player objects and displaying information
            Scanner sc=new Scanner(System.in);
            String inputLine = sc.nextLine();
            String[] t = inputLine.split(" ");
            int n=t.length;
            if(n==4){
            D04P02 player = new D04P02(t[0],Float.parseFloat(t[1]),Float.parseFloat(t[2]),Float.parseFloat(t[3]));
            }
            else if(n==3){
            D04P02 player = new D04P02(t[0],Float.parseFloat(t[1]),Float.parseFloat(t[2]));
            }
            else{
             D04P02 player = new D04P02(t[0],0.0f,0.0f);
            }
        }    
}

