package Program78;

class BankAccount {

    private String accNo, accHolderName;
    private double balance;

    BankAccount(String accHolderName, String accNo) {
        this.accHolderName = accHolderName;
        this.accNo = accNo;
        System.out.println("\nAccount Created Successfully!!");
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        if (balance <= 0) {
            System.out.println("Invalid Deposit Request!!!");
        } else {
            this.balance += balance;
            System.out.println("Rs. " + balance + " deposited successfully");
        }
    }

    public double withdraw(double balance) {
        if (balance <= 0) {
            System.out.println("Invalid Withdraw Request!!!");
            return 0;
        } else if (this.balance <= 0) {
            System.out.println("Oops!! Your account is empty!!!");
            return 0;
        } else if (balance > this.balance) {
            System.out.println("Oops!! The requested money is greater than the balance in your account!!!");
            return 0;
        } else {
            this.balance -= balance;
            System.out.println("Rs. " + balance + " withdrawl successfull");
            return this.balance;
        }
    }
}