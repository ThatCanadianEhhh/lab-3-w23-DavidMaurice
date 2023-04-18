// Simple Enhancement, second and third part question, let allowed fixed number of free transactions be 5
class BankAccount {
   private double balance, n_withdrawal, n_deposit, fee_deposit, fee_withdrawal;


   /**
    * Initiates balance zero when a a new bank account is created
    */
   public BankAccount() {
      balance = 0;
      n_withdrawal = 0;
      n_deposit = 0;
      fee_withdrawal = 0;
      fee_deposit = 0;
   }


   /**
    * Creates a bank account with the given initial balance
    */
   public BankAccount(double initialBalance, double fee_d, double fee_w) {
      balance = initialBalance;
      fee_withdrawal = fee_w;
      fee_deposit = fee_d;
   }


   /**
    * To deposit the given amount in the bank account
    */
   public void deposit(double amount) {
      double newBalance = balance + amount;
      balance = newBalance;
      n_deposit++;
   }


   /**
    * To withdraw the given amount from the account
    */
   public void withdraw(double amount) {
      n_withdrawal++;
      double newBalance = balance - amount;
      balance = newBalance;
   }


   /**
    * Returns the current balance of the bank account
    */
   public double getBalance() {
      return balance;
   }


   public void addInterest(double rate) {
      balance = balance * (1 + (rate / 100));
      balance = getBalance();
   }


   public void deductMonthlyCharge() {
      double total_fee = 0;
      if (n_deposit >= 5) {
         total_fee += (n_deposit - 5);
         double feeDeposit = fee_deposit;
      }
      if (n_withdrawal >= 5) {
         total_fee += (n_withdrawal - 5);
         double feeWithdrawal = fee_withdrawal;


      }
      balance = balance - total_fee;
      n_deposit = 0;
      n_withdrawal = 0;
   }
}


public class BankAccountTester {
   public static void main(String[] args) {
      BankAccount momsSavings = new BankAccount(5000, 1, 1);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      momsSavings.withdraw(200);
      System.out.print("The current balance after all transactions is: ");
      System.out.println(momsSavings.getBalance());
      momsSavings.deductMonthlyCharge();
      System.out.print("The current balance after all transactions is: ");
      System.out.println(momsSavings.getBalance());
      System.out.println("Expected: 3196");
   }
}