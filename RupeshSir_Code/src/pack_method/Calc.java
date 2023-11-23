package pack_method;

import java.util.Scanner;

public class Calc
{
    public void add()
    {
        int n1,n2,n3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = n1 + n2 ;
        System.out.println("add is " + n3 );
    }

    public static void sub()
    {
        int n1,n2,n3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = n1 - n2 ;
        System.out.println("sub is " + n3 );
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();

        Calc.sub();



    }
}
