package pack_atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int menu,bal, dep, wd ;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter 1. withdraw \n 2. deposit");
        menu = scan.nextInt();
        switch (menu){
            case 1:
                System.out.print("enter your balance: ");
                bal= scan.nextInt();
                System.out.print("enter withdraw amount: ");
                wd= scan.nextInt();
                if (wd<0)
                {
                    System.out.println("invalid amount entered");
                }
                else if (wd%100!=0) {
                    System.out.println("amount entered should be multiple of 100");


                } else if(wd>bal)
                {
                    System.out.println("insufficient funds");
                }
                else
                {
                    System.out.println("Withdraw success");
                    bal=bal-wd;
                    System.out.println("current balance : "+bal);
                }
                break;
            case 2:
                System.out.print("enter your balance: ");
                bal= scan.nextInt();
                System.out.print("enter deposit amount: ");
                dep= scan.nextInt();

                if(dep>30000)
                {
                    System.out.println("deposit amount limit exceeded");
                }
                else
                {
                    System.out.println("Deposit success");
                    bal=bal+dep;
                    System.out.println("current balance : "+bal);
                }
                break;
            default:
                System.out.println("invalid choice. Please choose between 1 or 2.");





        }

    }
}
