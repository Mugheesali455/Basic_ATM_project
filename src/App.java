 import java.util.*;

class ATM {
    float balance;
    int pin = 2850;

    public void checkpin() {
        System.out.println("please Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        if (enteredpin == pin) {
            Mainmenu();
        } else {
            System.out.println("Please Enter a valid pin");
            checkpin();
        }

    }

    public void checkbalance() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("If you have any issues please contact with Bank Manager");
        System.out.println("Your Balance is: " + balance);
        System.out.println("Press 1 to go back to menu");
        Scanner sc = new Scanner(System.in);
        int balanceopt = sc.nextInt();
        if (balanceopt == 1) {
            Mainmenu();
        } else {
            System.out.println("Invalid Command");
        }
    }

    public void Widthdraw() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter the amount You Want to Widthdraw: ");
        Scanner sc = new Scanner(System.in);
        float amountwithdraw = sc.nextFloat();
        if (amountwithdraw > balance) {
            System.out.println("Insufficent balnce");
        } else {
            balance = balance - amountwithdraw;
            System.out.println("Your Balance Has been successfully Updated");
        }
        System.out.println("Press 1 to go back to menu");
        int Widthdrawmenu = sc.nextInt();
        if (Widthdrawmenu == 1) {
            Mainmenu();
        } else {
            System.out.println("Invalid Command Make sure you press 1");
        }
    }

    public void Addmoney() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Enter the ammount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amountdeposit = sc.nextFloat();
        balance = balance + amountdeposit;
        System.out.println("Your balance have updated successfully");
        System.out.println("For Balance Enquiry please press 2: ");
        System.out.println("press 3 for Main menu");
        int balanceenquiry = sc.nextInt();
        if (balanceenquiry == 2) {
            checkbalance();
        } else if (balanceenquiry == 3) {
            Mainmenu();
        } else {
            System.out.println("Invalid Command");
        }
    }

    public void Exit() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void Mainmenu() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Please Choose an Operation");
        System.out.println("-1.Check Balance");
        System.out.println("-2.Widthdraw Money");
        System.out.println("-3.Add Money");
        System.out.println("-4.Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkbalance();
        } else if (opt == 2) {
            Widthdraw();
        } else if (opt == 3) {
            Addmoney();
        } else if (opt == 4) {
            Exit();
        } else {
            System.out.println("Please Enter a Valid Choice");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ATM obj = new ATM();
        obj.checkpin();
        obj.Mainmenu();
    }
}
