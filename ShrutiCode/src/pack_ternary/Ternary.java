package pack_ternary;

import java.util.Scanner;

public class Ternary
{
    public static void main(String[] args)
    {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number ");
        num = scan.nextInt();

        String s = (num > 0) ? "positive" : (num==0) ? "zero" : "negative";

        System.out.println(s);


    }
}
