class Account{
    String name;
    double balance;

    void withdraw(double amount){
        if(balance > amount) {
            double newBalance = balance - amount;
        }
        else {
            class InsufficientBalance extends Exception{
                InsufficientBalance(double currentBalance, double withdrawAmount){
                    String message = "Insufficient Balance. Current balance 100 is lower than the withdraw amount 500";
                   // super(message);
                }
            }
        }
    }
}