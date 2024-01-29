package herancaPolimorfismo.application;

import herancaPolimorfismo.entities.Account;
import herancaPolimorfismo.entities.BusinessAccount;
import herancaPolimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Eloise", 0.0, 500.0);

        // UPCASTING

        // A herança é uma relação "é-um", ou seja, uma BusinessAcount É uma Account!
        Account account1 = businessAccount;
        // Também funciona:
        Account account2 = new BusinessAccount(1003, "Mark", 0.0, 200.0);
        // Também funciona:
        Account account3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        // Type mismatch:
        // BusinessAcount account4 = account2;
        // Já assim, é possível:
        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        // Gerará um erro:
        // BusinessAccount account5 = (BusinessAccount) account3;
        // Esse if falha:
        if (account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(200.0);
            System.out.println("Loan!");
        }

        // Entra nesse if:
        if (account3 instanceof SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance();
            System.out.println("Update!");
        }

        Account account6 = new Account(1005, "Felipe", 1000.0);
        account6.withdraw(200.0);
        System.out.println(account6.getBalance());
        Account account7 = new SavingsAccount(1006, "Katarina", 1000.0, 0.01);
        account7.withdraw(200.0);
        System.out.println(account7.getBalance());
        Account account8 = new BusinessAccount(1007, "Peter", 1000.0, 500.0);
        account8.withdraw(200.00);
        System.out.println(account8.getBalance());



    }
}
