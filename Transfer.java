import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Transfer {
    int balance;
    int balance2 = 5000;
    String cust1;
    String custID1;
    String cust2 = "Vaibhav";

    Transfer(String cname, String cid, int C_bal) {
        cust1 = cname;
        custID1 = cid;
        balance = C_bal;
    }

    void send(int amount) {
        if (balance < amount) {
            System.out.println("====================================");
            System.out.println("Insufficient Fund to transfer Press 'A' to check your balance ");
            // System.out.println("====================================");
        } else if (amount < 0) {
            System.out.println("Please Check your input ");
        }

        else {
            balance2 = balance2 + amount;
            balance = balance - amount;
            System.out.println("\nAmount Transfered Sucessfully to " + cust2);
            System.out.println("\nAvailable Balance of " + cust1 + " = " + balance);
            System.out.println("\nAvailable Balane " + cust2 + " = " + balance2);
        }
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + cust1 + "!");
        System.out.println("Your ID is: " + custID1);
        System.out.println("Your Balance is: " + balance);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("A. Check your balance");
        System.out.println("B. Transfer Amount ");
        System.out.println("C. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {
                // Case 'A' allows the user to check their account balance
                case 'A':
                    System.out.println("====================================");
                    System.out.println("Available Balance = " + balance);
                    System.out.println("====================================");
                    System.out.println("Press 'B' to Transfer and 'C' for exit ");
                    System.out.println();
                    break;
                case 'B':
                    System.out.println();
                    System.out.println("Enter an amount to Transefer: ");
                    int balance2 = scanner.nextInt();
                    send(balance2);
                    System.out.println();

                case 'C':
                    System.out.println("====================================");
                    break;

                default:
                    System.out.println("Error: invalid option. Please enter A, B or C to access services.");
                    break;
            }
        } while (option != 'C');
        System.out.println("Thank you for banking with us!");
    }

    public static void main(String[] args) {
        Transfer piyush = new Transfer("Piyush", "AA30", 500);
        piyush.showMenu();
    }
}