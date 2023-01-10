package Chapter3;

import java.util.Scanner;

public class Petrol {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);


        System.out.println("Welcome to Samad Filling station!!!");

        System.out.println("Bodija, Ibadan");

        System.out.println("Enter purchase litre: ");
        int amount = data.nextInt();
        PetrolPurchase record = new PetrolPurchase("Bodija Ibadan", "PMS", amount, 70.00,   10);
        record.setPurchaseInLitres(amount);


        System.out.printf("Price per litre: %s%n", record.getPricePerLitre());
        System.out.printf("Discount %s%n", record.getPercentageDiscount());
        System.out.printf("Your net amount is: #%.2f%n", record.getNetPurchaseAmount());


    }
}
