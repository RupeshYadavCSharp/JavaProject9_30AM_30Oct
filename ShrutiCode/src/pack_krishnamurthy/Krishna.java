package pack_krishnamurthy;

import java.util.Scanner;

public class Krishna {
    public static void main(String[] args) {
        int num,rem, sum=0;

        System.out.println("enter any number: ");
        Scanner scan= new Scanner(System.in);
        num=scan.nextInt();
        int copy=num;


        while(num>0)
        {
            rem=num%10;
            int fact=1;
            for (int i = 1; i <= rem; i++) {

                fact=fact*i;


            }
            sum=sum+fact;

            num=num/10;



        }
        System.out.println(sum);
        if(copy==sum)
        {
            System.out.println("a krishnamurthy number");
        }
        else{
            System.out.println("not a krishna murthy number");
        }
    }
}
