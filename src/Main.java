/* Banking Application */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Are you a registered user? (Y/N)");
        String ans = scnr.nextLine(), fullName, username, password;

        if (ans.equals("Y")){
            System.out.println("Please sign in.");
            System.out.println("Username: ");
            username = scnr.nextLine();
            System.out.println("Password: ");
            password = scnr.nextLine();
        }
        else if (ans.equals("N")){
            System.out.println("Please create an account.");
            System.out.println("What is your full name? ");
            fullName = scnr.nextLine();
            System.out.println("Enter a username: ");
            username = scnr.nextLine();
            System.out.println("Enter a password: ");
            password = scnr.nextLine();
            Customer customer = new Customer(username, password, fullName);
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }

        // Retrieve what the user wants to do.
        String input;
        do {
            showMenu();
            input = scnr.nextLine();

            if (input.equals("A")) {

            }
            else if (input.equals("B")) {

            }
            else if (input.equals("C")) {

            }
            else if (input.equals("D")) {

            }
            else if (input.equals("E")) {

            }
            else if (input.equals("F")) {
                System.out.println("Goodbye.");
            }
            else {
                System.out.println("Invalid input. Please try again.");
            }
        }while(!input.equals("F"));

    }

    static void showMenu(){
        System.out.println("\nWhat would you liked to do?");
        System.out.println("A. Check your balance.");
        System.out.println("B. Make a deposit.");
        System.out.println("C. Make a withdrawal.");
        System.out.println("D. View previous transactions.");
        System.out.println("E. Calculate interest.");
        System.out.println("F. Exit.");
    }

}