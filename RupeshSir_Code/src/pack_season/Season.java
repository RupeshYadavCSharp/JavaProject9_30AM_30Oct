package pack_season;

import java.util.Scanner;

public class Season
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number ");
        int month = scan.nextInt();
        if(month >=3 && month <=5)
            System.out.println("Summer");
        else if(month >=6 && month <=8)
            System.out.println("Rainy season");
        else if(month >=9 && month<=11)
            System.out.println("Autumn");
        else if (month == 12 || month == 1 || month == 2)
            System.out.println("Winter");
        else
            System.out.println("invalid choice");




    }
}
