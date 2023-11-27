package pack_spy;

import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        int num,  lastdig,count=0, sum=0, prod=1;
        System.out.println("enter any number: ");
        Scanner scan= new Scanner(System.in);
        num=scan.nextInt();
        while(num>0)
        {
            lastdig=num%10;
            sum=sum+lastdig;
            prod=prod*lastdig;
            num=num/10;

            


        }
//        System.out.println(count);


        if(prod==sum)
        {
            System.out.println("spy number");
        }
        else {
            System.out.println("not a spy number");
        }

    }

}
