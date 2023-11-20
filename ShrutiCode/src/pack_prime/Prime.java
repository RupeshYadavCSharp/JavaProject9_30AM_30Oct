package pack_prime;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int num, count=0;
        System.out.println("enter number:  ");
        Scanner scan= new Scanner(System.in);
        num=scan.nextInt();
        for(int i=1; i<=num;i++)
        {
            if(num%i==0 )
            {
                count++;
            }

        }
        if(count==2)
        {
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}
