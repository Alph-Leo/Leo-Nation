package TenDaysOfCode;

import java.util.Scanner;

public class ReadIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 300;
        int total = 0;
        int counter = 0;
        System.out.println("Enter an integer");
        int n = in.nextInt();
        while (n != -1){
            total += n;
            counter++;
            System.out.println("Enter an integer or -1 to quit");
            n = in.nextInt();
        }
        if (total <= num){
            System.out.printf("Sum is less than: %d%nSum is correct: %d%n", num,  total);
        }else
            System.out.printf("Limit exceeded!!!%nSum is more than %d", num);
    }
}
