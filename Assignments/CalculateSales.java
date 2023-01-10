package Assignments;

import java.util.Scanner;

public class CalculateSales {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        double price = 0;

        System.out.println("Which product do you want to buy: ");
        int input = data.nextInt();

        while (input > 0 && input < 6) {

            switch (input) {
                case 1:
                    System.out.println("Enter product1 quantity");
                    int product1 = data.nextInt();
                    price = product1 * 2.98;
                    System.out.printf("The product price is: %.2f%n", price );
                    break;

                case 2:
                    System.out.println("Enter product2 quantity: ");
                    int product2 = data.nextInt();
                    price = product2 * 4.50;
                    System.out.printf("The product price is: %.2f%n", price );
                    break;

                case 3:
                    System.out.println("Enter product3 quantity: ");
                    int product3 = data.nextInt();
                    price = product3 * 9.98;
                    System.out.printf("The product price is: %.2f%n", price );
                    break;

                case 4:
                    System.out.println("Enter product4 quantity: ");
                    int product4 = data.nextInt();
                    price = product4 * 4.49;
                    System.out.printf("The product price is: %.2f%n", price );
                    break;

                case 5:
                    System.out.println("Enter prouct5 quantity: ");
                    int product5 = data.nextInt();
                    price = product5 * 6.87;

                    System.out.printf("The product price is: %.2f%n", price );
            }
            System.out.println("Which product do you want to buy: ");
            input = data.nextInt();
        }



    }
}
