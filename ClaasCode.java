package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = s.nextInt();

        if (grade > 85) {
            System.out.println("good");
            System.out.println("good");
            System.out.println("good");
        }
        else {
            System.out.println("not good!");
        }
        
        //1.Write program that create 2 boolean variables:
        //Boolean WashHands;
        //Boolean OrderMeal;
        //Give them values of true / false.
        //And check if both conditions are true in order for the user to be
        // able to eat. Write an appropriate description.
        
        
         public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("did you wash hands?");
        boolean washHands = s.nextBoolean();
        System.out.println("did you oder your meal??");
        boolean orderMeal = s.nextBoolean();

        if (washHands == true && orderMeal == true ) {
            System.out.println("You can eat!");
        }else {
            System.out.println("you can't eat");
        }
    }
}
