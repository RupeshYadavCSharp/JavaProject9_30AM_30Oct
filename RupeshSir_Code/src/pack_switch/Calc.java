package pack_switch;

import pack_prathamesh_hello.Hello;

import java.util.Scanner;


/**
 * this class represent switch case
 */
public class Calc
{
    /**
     * Purpose : this main method demo switch case
     * created by : Rupesh Yadav
     * Date : 2023-07-11
     * @param args
     */
    public static void main(String[] args) {

       char choice ;
       int n1,n2,n3;
        Scanner scan = new Scanner(System.in);
        System.out.println("A.Add\nS.Sub\nEnter choice");
        choice = scan.next().charAt(0); //"A"

        switch (choice)
        {
            case 'A':
            case 'a':
            case '1':
                System.out.println("----Addition------");
                System.out.println("Enter 2 numbers ");
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                n3 = n1 + n2 ;
                System.out.println("add is " + n3 );
                break;

            case 'S':
            case 's':
            case '2':
                System.out.println("----Subtraction------");
                System.out.println("Enter 2 numbers ");
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                n3 = n1 - n2 ;
                System.out.println("Sub is " + n3 );
                break;
            default:
                System.out.println("invalid choice ");
                break;


        }



    }
}
