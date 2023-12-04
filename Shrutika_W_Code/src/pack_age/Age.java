package pack_age;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int year,age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        year = scan.nextInt();

        if(year >= 2018)
        {
            age = (2023-year);
            System.out.println("Your age is " + age + " and you are a Baby! ");
        }
        else if(year >= 2005)
        {
            age = (2023-year);
            System.out.println("Your age is " + age + " and you are a Teenager! ");
        }
        else if(year>=1943)
        {
            age = (2023-year);
            System.out.println("Your age is " + age + " and you are an Adult! ");
        }
        else if(year<0)
        {
            System.out.println("Year cannot be negative! ");
        }
        else if(year>0)
        {
            age = (2023-year);
            System.out.println("Your age is " + age + " and you might be dead! ");
        }
        else
        {
            System.out.println("Invalid Input! ");
        }
    }
}
