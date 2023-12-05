package pack_sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int n,sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        n = scan.nextInt();
        sum = (n/1000) + (n%10);
        System.out.println("Sum is " + sum );
    }
}
