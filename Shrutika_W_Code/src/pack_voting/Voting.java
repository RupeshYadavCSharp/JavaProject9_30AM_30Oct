package pack_voting;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        int age,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scan.nextInt();


        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            n = (18-age);
            System.out.println("you can vote after " +  n  +  " years");
        }

        }
    }

