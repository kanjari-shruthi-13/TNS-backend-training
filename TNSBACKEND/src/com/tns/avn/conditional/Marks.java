package com.tns.avn.conditional;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt(); // number of marks to input

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 70) {
                System.out.println("Grade B");
            } else if (marks >= 40) {
                System.out.println("Grade C");
            } else {
                System.out.println("Fail");
            }

            System.out.println(); // blank line for clarity
        }

        sc.close();
    }
}
