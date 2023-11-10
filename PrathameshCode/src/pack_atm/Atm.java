package pack_atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int bal,withdraw,deposite,choice,amt;
        System.out.println("Enter the balance");
        Scanner scan = new Scanner(System.in);
        bal = scan.nextInt();
        System.out.println("choose option \n 1.Deposite \n 2.Withdraw");
        choice = scan.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter amount to deposite");
                amt = scan.nextInt();
                if(amt<30000){
                    deposite = amt + bal;
                    System.out.println("Deposit Success \n Current bal is " + deposite);
                }
                else{
                    System.out.println("Deposit Limit Exceed");
                }
                break;

            case 2:
                System.out.println("Enter amount to withdraw");
                amt = scan.nextInt();
                if (amt>bal){
                  System.out.println("you have insufficient balance");
                }else if (amt%100 != 0 && amt>0) {
                    System.out.println("Amount should be multiple of 100");
                }else if (amt<0) {
                    System.out.println("Invalid Amount Entered ");
                } else{
                    withdraw = bal - amt;
                System.out.println("withdraw Success\nCurrent bal is " + withdraw);
                }
                break;
            default:
                System.out.println("invalid choice");

        }




    }
}
