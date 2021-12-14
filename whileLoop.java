package com.company;

import java.util.Scanner;

// 1. Write a program to print numbers from 1 to 100.
// 2. Write a program to print only even numbers from 1 to 100
// 3. Write a program to calculate the sum of first 10 natural number.

public class Main {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        boolean x = true;
      /*  while (x){
            System.out.println("hey");
            x = false;
        }*/

     /*   int y = 1;
        while (y < 3){
            System.out.println(y);
            y = y + 1;
        }*/
        int counter = 0 ;
        System.out.println("2 + 3 = ? ");
        int answer = s.nextInt();
        while (answer != 5){
            System.out.println("Wrong answer, try again...");
            answer = s.nextInt();
            counter = counter + 1;
        }
        System.out.println("Yayi!! you got it afeter " +  counter + " times");

    }
}
