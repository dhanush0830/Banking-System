package BankingSystem.app;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Banking b = new Banking();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check Balance");
            System.out.println("5.View All Accounts");
            System.out.println("6.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Accno:");
                    int accno = sc.nextInt();
                    System.out.println("Enter Name:");
                    String name = sc.next();
                    System.out.println("Enter Balance:");
                    int balance = sc.nextInt();
                    b.createAccount(accno, name, balance);
                    break;

                case 2:
                    System.out.println("Enter Id:");
                    int id = sc.nextInt();
                    System.out.println("Enter Amount:");
                    int amount = sc.nextInt();
                    b.deposit(id, amount);
                    break;

                case 3:
                    System.out.println("Enter Id:");
                    int id1 = sc.nextInt();
                    System.out.println("Enter Amount:");
                    int amount1 = sc.nextInt();
                    b.withdraw(id1, amount1);
                    break;

                case 4:
                    System.out.println("Enter Id:");
                    int id2 = sc.nextInt();
                    b.getBalance(id2);
                    break;

                case 5:
                    b.showAccounts();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}