package pack_table;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int n,ans;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            ans = n*i;
            System.out.println( n + " X " + i + " = " + ans);
        }
    }
}
