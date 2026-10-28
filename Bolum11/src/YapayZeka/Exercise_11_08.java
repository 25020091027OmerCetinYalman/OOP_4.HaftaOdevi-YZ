package YapayZeka;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_11_08 {
    public static void main(String[] args) {
        AccountWithTransactions account = new AccountWithTransactions("George", 1122, 1000);
        AccountWithTransactions.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Hesap Sahibi: " + account.getName());
        System.out.println("Yillik Faiz Orani: " + AccountWithTransactions.getAnnualInterestRate() + "%");
        System.out.println("Guncel Bakiye: " + account.getBalance() + " TL");

        System.out.println("\n--- Islem Gecmisi ---");
        for (Transaction t : account.getTransactions()) {
            System.out.println("Tip: " + t.getType() + " | Tutar: " + t.getAmount() + " | Bakiye: " + t.getBalance() + " | Aciklama: " + t.getDescription());
        }
    }
}

class AccountWithTransactions {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public AccountWithTransactions(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() { return name; }
    public double getBalance() { return balance; }
    public static double getAnnualInterestRate() { return annualInterestRate; }
    public static void setAnnualInterestRate(double rate) { annualInterestRate = rate; }
    public ArrayList<Transaction> getTransactions() { return transactions; }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('C', amount, balance, "Para yatirildi"));
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Para cekildi"));
    }
}