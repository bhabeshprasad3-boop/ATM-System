import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String user = "abc";
        int pin = 1234;

        System.out.println("_____WelCome____");
        System.out.println("Press enter to insert card");
        sc.nextLine();


        System.out.println("Enter A/c Holder Name: ");
        String username = sc.next();
        System.out.println("Enter 4-digit PIN: ");
        int userpin = sc.nextInt();

        if (user.equals(username)) {
            if (pin == userpin) {
                System.out.println("Successfully Logged in");
            }else {
                System.out.println("Invalid PIN");
            }
        }else {
            System.out.println("Invalid Username");
        }
        int balance= 0;
        int deposit;
        int resetpin;
        int temp;
        while (true){


            int withdraw;
            System.out.println("-------ATM Menu-------");
            System.out.println("1. Check Balance");
            System.out.println("2. withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.println("6. Choose an option: ");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Current Balance: "+balance);
                    break;

                case 2:

                    System.out.println("Please Enter Withdraw Amount: ");
                    withdraw = sc.nextInt();
                    if(balance<withdraw){
                        System.out.println("Low Balance");
                    }
                    else {
                        balance = balance - withdraw;
                        System.out.println("Withdraw Amount: " + withdraw);
                        System.out.println("Now The Current Balance: " + balance);
                    }break;

                case 3:
                    System.out.println("Enter Deposit Amount: ");
                    deposit = sc.nextInt();
                    System.out.println("Rs"+deposit+ " is successfully deposited");
                    balance = balance + deposit;

                    break;


                case 4:
                    System.out.println("Enter Current PIN");
                    resetpin = sc.nextInt();
                    if(resetpin == pin){
                        System.out.println("Enter New PIN");
                        pin = sc.nextInt();
                        System.out.println("PIN Successfully Changed");
                    }
                    else {
                        System.out.println("Wrong PIN");
                    }break;

                case 5:
                    System.out.println("Thank You for using our ATM");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }



    }
}