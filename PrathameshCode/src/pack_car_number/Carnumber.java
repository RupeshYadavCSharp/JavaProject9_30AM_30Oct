package pack_car_number;

import java.util.Scanner;

public class Carnumber {
    public static void main(String[] args) {
        int car,a,b,c,d,e,f,sum;
        System.out.println("Enter 4 Digit car number");
        Scanner scan = new Scanner(System.in);
        car = scan.nextInt();
        if(car>999 && car<10000) {
            a = car % 10;
            b = car / 10;
            c = b % 10;
            d = b / 10;
            e = d % 10;
            f = d / 10;
            sum = a + c + e + f;
            System.out.println("THe sum of the digit is: " + sum);
            if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                System.out.println("The car number is lucky");
            } else {
                System.out.println("The car number is not lucky");
            }
        }
        else{
            System.out.println("Invalid car number");
        }
    }
}
