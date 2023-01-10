package Assignments;

import java.util.Scanner;

public class SumThree {

       public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
           System.out.println(" enter a 3digit number ");
           int userInput = scanner.nextInt();
            while (userInput !=0) {
                int y = userInput / 100;
                int z = userInput % 100;
                int q = z/10;
                int p = z%10;
                System.out.println(y);
                System.out.println(q);
                System.out.println(p);
                System.out.println(y + q +p);

                System.out.println(" enter a number ");
                userInput = scanner.nextInt();
            }
       }
}
