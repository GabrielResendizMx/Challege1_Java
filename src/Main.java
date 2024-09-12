import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String name = "Jose";
       String typeCount = "Checking";
        double balance = 2000.99;
        int option = 0;


        System.out.println("*************************************************");

        System.out.println("\nName client: " + name);
        System.out.println("Type account is: " + typeCount);
        System.out.println("The available balance is: " + balance + "$");

        System.out.println("*************************************************");

        String menu = """
                *** Write the number of the option you want ***
                1 - Check balance
                2 - Withdraw
                3.- Deposit
                9 - Exit 
                """;

        Scanner keyboard = new Scanner(System.in);
        while (option != 9){
            System.out.println(menu);
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    System.out.println("You current balance is: " + balance +"$");
                    break;

                case 2 :
                    System.out.println("How much do you want to withdraw?");
                    double valueWithdraw = keyboard.nextDouble();

                    if (valueWithdraw >  balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance = balance - valueWithdraw;
                        System.out.println("updated balance is: " + balance);
                    }
                    break;

                case 3 :
                    System.out.println("How much do you want to deposit?");
                    double valueDeposit = keyboard.nextDouble();
                    balance = balance + valueDeposit;
                    System.out.println("updated balance is: " + balance);
                    break;

                case 9 :
                    System.out.println("bay... :C");
                    break;

                default:
                    System.out.println("not valid option");
            }
        }
    }
}