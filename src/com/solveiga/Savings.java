package com.solveiga;

public class Savings implements Illustration{
   private double balance = 0.00;
   private double deposit;
   private int years;
   private double interestRate;
   private double interest;
   private Person person;

    public Savings(double deposit, int years, Person person) {
        this.balance = deposit;
        this.years = years;
        this.person = person;
        findInterestRate(years); //can it be here?
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("You don't have sufficient funds");
        }
    }

    private void findInterestRate(int years) {
        switch (years) {
            case 1:
                this.interestRate = 1.00;
                break;
            case 2:
                this.interestRate = 1.50;
                break;
            case 3:
                this.interestRate = 2.00;
                break;
            case 4:
                this.interestRate = 2.50;
                break;
            default:
                this.interestRate = 2.85;
        }
    }

    @Override
    public String generateIllustration() {
        System.out.println("Opened savings");
        return null;
    }
}
