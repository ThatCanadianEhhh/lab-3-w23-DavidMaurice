// File name= "SavingsAccountTester.java"
// Given below is the required class along with tester
// class

class SavingsAcount {
    private double balance;
    private double InterestRate;
    /**
     Initiates balance zero when a new bank account is created
     */
    public SavingsAcount() {
        balance = 0;
        InterestRate = 0;
    }
    /**
     * Creates a bank account with the given initial balance
     */
    public SavingsAcount(double initialBalance, double rate) {
        balance = initialBalance;
        InterestRate = rate;
    }
    /**
     * To deposit the given amount in the bank account
     */
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
    }
    /**
     * To withdraw the given amount from the account
     */
    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
    }
    /**
     * Returns the current balance of the bank account
     */
    public double getBalance() {
        return balance;
    }
    //adds interest without any explicit parameter public void addInterest()

    {
        balance = getBalance() * (1 + (InterestRate / 100));
        balance = getBalance();
    }

    public void addInterest() {

    }
}
public class SavingsAcountTester {
    public static void main(String[] args) {
        /* Initiates account with balance 1000 and 10% interest*/
        SavingsAcount momsSavings = new SavingsAcount(1000, 10); /*Adds interest*/
        momsSavings.addInterest();
        System.out.print("The current balance after adding interest is: ");
        System.out.println(momsSavings.getBalance());
        System.out.println("Expected: 1100");
    }
}