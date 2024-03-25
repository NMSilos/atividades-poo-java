package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char choice = sc.next().charAt(0);

        if(choice == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(number, holder, initialDeposit);
        } else {
            account = new BankAccount(number, holder);
        }

        System.out.println("\nAccount data:" + account);

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account:" + account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated Account: " + account);

        sc.close();
    }
}
