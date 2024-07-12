package Program78;

public class Bank_Customer {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Meet","PMK007646");

        System.out.println();
        acc.deposit(10000);
        System.out.println(acc.getBalance());
    }
}