package runAway;


import java.util.Scanner;

public class RunWayLength {



    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        System.out.println("Enter velocity");
        double velocity = data.nextDouble();

        System.out.println("Enter acceleration");
        double acceleration = data.nextDouble();

        double length = (velocity * velocity)/ (2 * acceleration);

        System.out.printf("The run way length is %.4f%n", length);

    }
}

