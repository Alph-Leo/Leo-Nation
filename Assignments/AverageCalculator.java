package Assignments;

import java.util.Scanner;

public class AverageCalculator {

        public static void main(String[] args) {

            Scanner data = new Scanner(System.in);

            int total = 0;
            int counter = 0;

            System.out.print("Enter grade or -1 to quit");
            int grade = data.nextInt();

            while (grade != -1) {
                total += grade;
                counter++;

                System.out.print("Enter grade or -1 to quit");
                grade = data.nextInt();
            }

                 if (counter != 0){
                     double average = (double) total / counter;

                     System.out.printf("%nTotal of the %d grade entered is: %d%n", counter, total);
                     System.out.printf("Total average is: %.2f%n", average);
                 }
                 else {
                     System.out.println("No grades were entered");

                 }




        }
}
