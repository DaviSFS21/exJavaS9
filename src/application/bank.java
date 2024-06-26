package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAcc;

public class bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        String accHolder;
        double balance = 0.00;
        char option;

        System.out.println("Enter the account data: ");
        System.out.print("Account ID: ");
        int accId = sc.nextInt();

        sc.nextLine();

        System.out.print("Account holder: ");
        accHolder = sc.nextLine();

        System.out.print("Is there a initial deposit? (y/n): ");
        do {
            option = sc.next().charAt(0);
                switch (option) {
                    case 'y':
                        System.out.print("Enter amount to deposit: ");
                        balance = sc.nextDouble();
                        break;
                    case 'n':
                        break;
                    default:
                        System.out.print("Invalid option! Try again: ");
                        break;
                }
        } while (option != 'y' && option != 'n');

        BankAcc account = new BankAcc(accId, accHolder, balance);

        System.out.printf("Data: " + account);
    }
}
