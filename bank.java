import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Saurav";
        long accNo = 1234567890L;
        String type = "Savings";
        double balance = 5000;
        System.out.println("Account Holder ="+(name));
        System.out.println("Account Number ="+(accNo));
        System.out.println("Account Type ="+(type));
        System.out.println("Account Balance ="+(balance));
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        if (choice == 1)
            balance += amount;
        else if (choice == 2 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");

        System.out.println("\nAccount Holder : " + name);
        System.out.println("Account Number : " + accNo);
        System.out.println("Account Type   : " + type);
        System.out.println("Balance        : " + balance);

        sc.close();
    }
}