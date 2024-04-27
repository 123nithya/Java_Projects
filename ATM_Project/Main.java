import java.util.*;

public class Main {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;
        int addAmount = 0;
        int takeAmount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin number : ");
        int password = sc.nextInt();
        if (password == pin) {
            System.out.println("Enter your name : ");
            String name = sc.next();
            System.out.println("Welcome to Mini ATM " + name);
            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to receive the receipt");
                System.out.println("Press 5 to exit");

                System.out.println("Enter your preferrable Option : ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount do you want to add : ");
                        addAmount = sc.nextInt();
                        System.out.println("Successfully credited");
                        balance += addAmount;
                        break;
                    case 3:
                        System.out.println("How much amount you want to take : ");
                        takeAmount = sc.nextInt();
                        if (takeAmount > balance) {
                            System.out.println("Insufficient balance");
                            System.out.println("Try less than your current balance");
                        } else {
                            System.out.println("Your amount is successfully credited");
                            balance -= takeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to Mini ATM");
                        System.out.println("Available balance is : " + balance);
                        System.out.println("Amount deposited : " + addAmount);
                        System.out.println("Amount credited : " + takeAmount);
                        System.out.println("Thanks for Coming");
                        break;
                }
                if (option == 5) {
                    System.out.println("Thank you");
                    break;
                }
            }
        } else {
            System.out.println("You have entered Wrong pin number");
        }
    }
}