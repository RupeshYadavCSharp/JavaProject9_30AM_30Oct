package pack_placment;

import java.util.Scanner;

public class Placement {
    public static void main(String[] args) {
        int cse,me,ese;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of students placed in CSE: ");
        cse = scan.nextInt();
        System.out.println("Enter no of students placed in ME: ");
        me = scan.nextInt();
        System.out.println("Enter no of students placed in ESE: ");
        ese = scan.nextInt();
        if(cse<0 || ese<0 || me<0) {
            System.out.println("Input is Invalid");
        }
        else if(cse>me && cse>ese)
        {
            System.out.println("Highest Placement: CSE ");
        }
        else if(me>cse && me>ese)
        {
            System.out.println("Highest Placement: ME ");
        }
        else if(ese>cse && ese>me)
        {
            System.out.println("Highest Placement: ESE ");
        }

        else if( cse==me && me==ese)
        {
            System.out.println("None of dept has got the highest placement ");
        }
        else if(cse==me)
        {
            System.out.println("Highest Placement: CSE and ME");
        }
        else if(cse==ese)
        {
            System.out.println("Highest Placement: CSE and ESE");
        }
        else
        {
            System.out.println("Highest Placement: ESE and ME");
        }








    }
}
