import java.util.Scanner;

public class AccountTest {

        public static void main(String[] args) {
            Scanner data = new Scanner(System.in);
        Account leo = new Account();

            System.out.printf("Initial status is: %s%n", leo.getName(),"%s%n", leo.getBalance(), "%s%n", leo.getAccountNumber());
            System.out.println("Please enter your name: ");
            String name = data.nextLine();
            leo.setName(name);

            System.out.println("Please set your Account number: ");
            String accountNumber = data.nextLine();
            leo.setAccountNumber(accountNumber);
            System.out.printf("Your Account name is: %s%n", leo.getName());
            System.out.printf("Your account number is: %s%n", leo.getAccountNumber());
            System.out.printf("Your Account balance is: %s%n", leo.getBalance());

            System.out.println("Enter deposit amount");
            double cash = data.nextDouble();
            System.out.printf("Your account has been credited with: %.2f%n", cash);
            leo.deposit(cash);
            System.out.printf("Your new account balance is: %.2f%n", cash);
            System.out.println("Enter withdrawal amount: ");
            double withdraw = data.nextDouble();
            System.out.printf("Your Account has been debited with: %.2f%n", withdraw);
            leo.withdrawal(withdraw);
            System.out.printf("Your new balance is: %.2f%n", leo.getBalance());
        }

    }