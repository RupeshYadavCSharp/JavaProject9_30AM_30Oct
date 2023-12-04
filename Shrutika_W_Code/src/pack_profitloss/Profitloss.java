package pack_profitloss;

import java.util.Scanner;

public class Profitloss {
    public static void main(String[] args) {
        int sp,cp,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cp: ");
        cp = scan.nextInt();
        System.out.println("Enter sp: ");
        sp = scan.nextInt();

        if(sp>cp)
        {
            n = (sp-cp);
            System.out.println("Profit");
            System.out.println("Profit of Rs " + n);
        }
        else if(cp>sp)
        {
           n =  (cp-sp);
            System.out.println("Loss");
            System.out.println("Loss of Rs " + n );
        }
        else
        {
            System.out.println("No profit no loss");
        }

    }
}
