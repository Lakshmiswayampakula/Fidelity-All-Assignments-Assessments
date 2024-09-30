package assignment3.AccountProgram;

import java.util.Scanner;

public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter account id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter account type: ");
            String accountType = sc.nextLine();
            System.out.println("Enter balance: ");
            double balance = sc.nextDouble();

            Account account = new Account(id, accountType, balance);
            System.out.println(account.getDetails());

            System.out.println("Enter amount to withdraw:");
            double amountToWithdraw = sc.nextDouble();
            if (account.withdraw(amountToWithdraw)) {
                System.out.println("New balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient Balance");
            }
            sc.close();
        }
}
