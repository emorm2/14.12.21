package com.company;

import java.util.Scanner;

// 1. Write a program to print numbers from 1 to 100.
// 2. Write a program to print only even numbers from 1 to 100
// 3. Write a program to calculate the sum of first 10 natural number.

public class Main {

    public static void main(String[] args) {
        // 1:
   /*     int num = 0;
        while(num < 100){
            num = num +1;
            System.out.println(num);
        }*/

      /*  int num2 = 0;
        while (num2 < 100){
            num2 = num2 + 2;
            System.out.println(num2);
        }*/

        int num3 = 0;
        int sum = 0;
        while (num3 < 10){
            num3 ++;
            sum = sum + num3;
        }
        System.out.println(sum);  
    }
}
