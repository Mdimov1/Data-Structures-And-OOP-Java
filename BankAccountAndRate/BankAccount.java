package edu.softuni;

public class BankAccount {
    private static final double DEFAULT_INTEREST = 0.02;

    private static double interestRate;
    private static int bankAccountCount;

    private int id;
    private double balance;


    public BankAccount(){
        this.id = ++bankAccountCount;
    }
    public static void setInterest(double interest) {
        interestRate = interest;
    }
    public int getId(){
        return this.id;
    }

    public double getInterestRate(int years) {
        return this.balance  * interestRate * years;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
