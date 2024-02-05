package tratamentoExcecoes.exercicio.application;

import tratamentoExcecoes.exercicio.model.entities.Account;
import tratamentoExcecoes.exercicio.model.exceptions.WithdrawException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Java Bank! Please enter your account data: ");
        System.out.print("Number: ");
        int accountNumber = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Holder: ");
        String accountHolder = userInput.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = userInput.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = userInput.nextDouble();
        Account account = new Account(accountNumber, accountHolder, initialBalance, withdrawLimit);
        System.out.println();
        System.out.println(account.showAccountInfo());
        System.out.println();
        System.out.print("Enter the amount you wish to withdraw from your account: ");
        double amount = userInput.nextDouble();
        try {
            account.withdraw(amount);
            System.out.print("New balance: " + account.getBalance());
        } catch (WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        System.out.println();
        System.out.println("Thank you for using Java Bank!");

        userInput.close();

    }
}
