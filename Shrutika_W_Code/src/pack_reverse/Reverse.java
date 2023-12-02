package pack_reverse;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n,n1,n2,n3,n4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        n = scan.nextInt();
        n1 = n%10;
        n4 = n/10;
        n2 = n4%10;
        n3 = n/100;
        System.out.println("Reverse number is " + n1 + n2 + n3);

    }
}
