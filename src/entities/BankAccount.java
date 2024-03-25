package entities;

public class BankAccount {

    private int number;
    private String holder;
    private double balance;

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public BankAccount(int number, String holder, double initialDeposit){
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

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return String.format("\nAccount %d, Holder: %s, Balance: $ %.2f",
                number, holder, balance);
    }

}
