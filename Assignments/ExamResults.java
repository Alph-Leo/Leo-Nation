package Assignments;

import java.util.Scanner;

public class ExamResults {

        public static void main(String[] args) {

            Scanner data = new Scanner(System.in);

            int passes = 0;
            int failures = 0;
            int counter = 1;

            while (counter <= 10) {
                System.out.print("Enter results (1 = pass, 2 = fail): ");
                int result = data.nextInt();
                if (result == 1) {
                    passes++;
                }
                else {
                    failures++;
                }
                counter++;
            }
            System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
            if (passes > 8){
                System.out.println("Bonus to instructor!");
            }

        }
}
