package com.company;

import java.util.Scanner;

// 1. Write a program to print numbers from 1 to 100.
// 2. Write a program to print only even numbers from 1 to 100
// 3. Write a program to calculate the sum of first 10 natural number.

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // int password;

     /*   do{
            System.out.println("what is your password? ");
            password = s.nextInt();
            System.out.println("Wrong password");
        }while(password != 123);*/

        /*do {
            System.out.println("not the end");
        }while(true);*/

        System.out.println("please enter a number");
        int number = s.nextInt();
      /*  if(number == 1)
            System.out.println("one");
        if (number == 2)
            System.out.println("two");*/
            
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            default:
                System.out.println("another number");
        }
    }
}
