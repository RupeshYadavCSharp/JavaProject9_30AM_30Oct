package pack_luckycarno;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        int carny,sum;
        System.out.println("enter you car number ");
        Scanner scan= new Scanner(System.in);
        carny=scan.nextInt();
        if(carny>999 && carny<10000)
        {
            sum=(carny%10)+((carny%100)/10)+((carny/100)%10)+(carny/1000);

            if(sum%3==0 || sum%5==0 || sum%7==0){


                System.out.println("Your car number is lucky number");
            }
            else{
                System.out.println("Your car number is unlucky number");
            }


        }
        else{
            System.out.println("Invalid number. Please enter 4 digit number. ");
        }





    }

}
