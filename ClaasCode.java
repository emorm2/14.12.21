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
    }
}
