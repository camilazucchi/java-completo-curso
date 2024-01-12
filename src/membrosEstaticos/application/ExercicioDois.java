package membrosEstaticos.application;

import membrosEstaticos.util.Account;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Please enter your account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the account holder: ");
        String holder = sc.nextLine();

        System.out.println("Is there an initial deposit?\nY - Yes\nN - No");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("N")) {
            account = new Account(accountNumber, holder);
            account.showAccount();
            System.out.println("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            account.showAccount();
            System.out.println("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);
            account.showAccount();
        } else {
            System.out.println("Enter an initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            account = new Account(accountNumber, holder, initialDepositValue);
            account.showAccount();
            System.out.println("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            account.showAccount();
            System.out.println("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);
            account.showAccount();
        }


        sc.close();

    }
}
