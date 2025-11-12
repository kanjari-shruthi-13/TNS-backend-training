package com.tns.avn.loops;

public class EnhancedForLoop {

	    public static void main(String[] args) {

	        // Array of student names
	        String names[] = {"Shruthi", "Sushma", "Chinnu"};

	        // 2D array of marks for each student (3 subjects)
	        int marks[][] = {
	            {85, 90, 78},   // Shruthi
	            {88, 76, 92},   // Sushma
	            {91, 89, 85}    // Chinnu
	        };

	        int index = 0; // to track student names

	        // Outer enhanced for loop for each student's marks
	        for (int[] studentMarks : marks) {
	            System.out.println("Student Name: " + names[index]);

	            int total = 0;
	            // Inner enhanced for loop for each subject mark
	            for (int mark : studentMarks) {
	                System.out.println("  Mark: " + mark);
	                total += mark;
	            }

	            double average = total / (double) studentMarks.length;
	            System.out.println("  Average Marks: " + average);
	            System.out.println("--------------------------");

	            index++;
	        }
	    }
	}


