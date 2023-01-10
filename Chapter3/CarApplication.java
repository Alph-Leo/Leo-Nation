package Chapter3;

import java.util.Scanner;

public class CarApplication {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        Car hound = new Car("Bentley", "2022", 10000, 5);
        Car furious = new Car("Limo", "2020", 15000, 7);


        System.out.printf("The car model is: %s%n", hound.getModel());
        System.out.printf("The car year is: %s%n", hound.getYear());
        System.out.printf("The car price is: %s%n", hound.getPrice());
        System.out.printf("Your discount is: %s%n", hound.getDiscount());
        System.out.printf("Your net amount is: %s%n", hound.getNetAmount());


        System.out.printf("The model is: %s%n", furious.getModel());
        System.out.printf("The year is: %s%n", furious.getYear());
        System.out.printf("The price is: %s%n", furious.getPrice());
        System.out.printf("Your discount is: %s%n", furious.getDiscount());
        System.out.printf("Your net amount is: %s%n", furious.getNetAmount());

    }
}
