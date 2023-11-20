package pack_fact;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        double num;
        double fact=1;
        System.out.println("enter number for calculating factorial");
        Scanner scan=new Scanner(System.in);
        num=scan.nextDouble();
        if(num==0)
        {
            System.out.println("factorial of O is 1");
        }
        else if (num<0)
        {
            System.out.println("Factorial of negative number is ALWAYS not defined");

        }
        else {
            for(int i=1 ; i<=num; i++)
            {
                fact=fact*i;

            }
            System.out.println("the factorial of "+ num + "is" + fact);

        }



    }

}
