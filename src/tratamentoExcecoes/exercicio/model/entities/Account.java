package tratamentoExcecoes.exercicio.model.entities;

import tratamentoExcecoes.exercicio.model.exceptions.WithdrawException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public String showAccountInfo() {
        return "Account information:\n"
                + "Number: "
                + String.format("%2d", getNumber())
                + "\nHolder: "
                + getHolder()
                + "\nBalance: "
                + String.format("%.2f", getBalance())
                + "\nWithdraw limit: "
                + String.format("%.2f", getWithdrawLimit());
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void validateWithdraw(double amount) throws WithdrawException {
        if (balance <= getWithdrawLimit()) {
            throw new WithdrawException("Insufficient funds.");
        }
        if (amount > getWithdrawLimit()) {
            throw new WithdrawException("The amount you entered exceeds the withdraw limit.");
        }
    }

    public void withdraw(double amount) throws WithdrawException {
        validateWithdraw(amount);
        balance -= amount;
    }



}
