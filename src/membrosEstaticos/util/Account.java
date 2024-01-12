package membrosEstaticos.util;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private static double TAX = 5.00;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }


    // O saldo da conta só pode ser alterado através de SAQUE e DEPÓSITO.
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + TAX;
    }

    public void showAccount() {
        System.out.println("Account data:\nAccount: " + getNumber() + "\n" +
                "Holder: " + getHolder() + "\n" + "Balance: $ " + getBalance());
    }

}
