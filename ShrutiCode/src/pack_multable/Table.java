package pack_multable;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num;

        System.out.println("enter number you want to print table of ?  ");
        Scanner scan = new Scanner(System.in);
        num= scan.nextInt();

        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(num + "X" + i + "=" + num*i );
        }
    }
}
