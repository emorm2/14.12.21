package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
       System.out.println("Enter a number: ");
        int number = s.nextInt();
        System.out.println("Enter another number: ");

        int number2 = s.nextInt();
        int res = number + number2;
        System.out.println(res);
      //  System.out.println(number + number2);
    }
}
