package pack_ternery;

import java.util.Scanner;

public class Positivenegative {
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter any number ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        String s = (num > 0) ? "positive" : ((num == 0) ? "zero" : "negative") ;

        System.out.println(s);


    }
}
