package Assignments;

import java.util.Scanner;

public class employeeSalaryCalculator {

    public static void main(String[] args) {

        int hourRate = 1000;
        int counter = 0;
        int hourWorked=0;
        double extraHourRate=0;
        int extraHourWorked =0;
        double grossPay =0;
        String name ="";
        Scanner data = new Scanner(System.in);
        System.out.println("Enter name");
         name = data.next();
            do {
                System.out.println("Enter hours worked");
                hourWorked = data.nextInt();
                hourRate *= hourWorked;

                System.out.printf("Your hour worked is: %s%n", hourWorked);
                System.out.printf("Your hour rate is: %s%n", hourRate);
                System.out.println("Enter extra hour worked");
                extraHourWorked = data.nextInt();

                extraHourRate = 1500;
                extraHourRate *= extraHourWorked;

                System.out.printf("Your extra hour worked is: %s%n", extraHourWorked);
                System.out.printf("Your extra hour rate is: %s%n", extraHourRate);


                grossPay = hourRate + extraHourRate;
                System.out.printf("Gross pay is: %s", grossPay);
                counter++;

                System.out.println("Enter name");
                name = data.next();

            }while(!(name.equalsIgnoreCase("no")));
    }


        }
