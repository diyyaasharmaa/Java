
package bankapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Bank1 bank = new Bank1();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Banking Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = sc.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double initialBalance = sc.nextDouble();
                    bank.createAccount(accountNumber, accountHolderName, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = sc.nextDouble();
                    bank.withdraw(accountNumber, withdrawalAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = sc.nextLine();
                    bank.displayAccountDetails(accountNumber);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting... Thank you for using the Banking Application.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
