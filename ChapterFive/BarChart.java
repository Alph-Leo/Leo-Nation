package ChapterFive;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, i;

        System.out.println("Enter 5 numbers from 1 to 30");

        num1 = data.nextInt();
        num2 = data.nextInt();
        num3 = data.nextInt();
        num4 = data.nextInt();
        num5 = data.nextInt();

        for (i = 1; i <= num1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (i = 1; i <= num2; i++) {
            System.out.print("*");
            System.out.println();
        }
        for (i = 1; i <= num3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (i = 1; i <= num4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (i = 1; i <= num5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
