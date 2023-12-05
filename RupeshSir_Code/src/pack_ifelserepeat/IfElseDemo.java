package pack_ifelserepeat;

import java.util.Scanner;

public class IfElseDemo
{
    public static void main(String[] args) {

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number ");
        num = scan.nextInt();

        if(num > 0)
        {
            System.out.println("positive ");
        }
        else if(num < 0)
        {
            System.out.println("Negative ");
        }
        else
        {
            System.out.println("Zero ");
        }

    }
}
