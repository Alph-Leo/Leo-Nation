package Assignments;

import java.util.Scanner;

public class ClassAverage {

        public static void main(String[] args) {

            Scanner data = new Scanner(System.in);

            int total = 0;
            int gradeCounter = 1;
            int average = 0;

            while (gradeCounter <= 10) {

                System.out.print("Enter grade: ");
                int grade = data.nextInt();

                total += grade;
                gradeCounter++;
                average = total / 10;

            }
            System.out.printf("Total grade is: %d%n", total);
            System.out.printf("Average is: %d%n", average);
        }
}
