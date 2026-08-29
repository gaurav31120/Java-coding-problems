import java.util.Scanner;

public class BankAccount {

    static class BankAcc {
        int accountNumber;
        String accountHolder;
        double balance;

        BankAcc(int accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        void depositMoney(double amount) {
            balance += amount;
        }

        boolean withdrawMoney(double amount) {
            if (amount > balance) {
                return false;
            }

            balance -= amount;
            return true;
        }

        void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number");
        int accountNumber = sc.nextInt();

        System.out.println("Enter account holder");
        String accountHolder = sc.next();

        System.out.println("Enter balance");
        double balance = sc.nextDouble();

        BankAcc account = new BankAcc(
                accountNumber,
                accountHolder,
                balance
        );

        System.out.println("Enter deposit money");
        double deposit = sc.nextDouble();
        account.depositMoney(deposit);

        System.out.println("Enter withdrawal money");
        double withdrawal = sc.nextDouble();

        if (!account.withdrawMoney(withdrawal)) {
            System.out.println("Insufficient balance");
        }

        System.out.println("===== Bank Account =====");
        account.displayAccountDetails();

        sc.close();
    }
}