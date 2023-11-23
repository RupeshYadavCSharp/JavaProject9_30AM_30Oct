package pack_dowhile;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        int i;
        do {
            System.out.println("Enter any number");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();

        } while (i != -1);

        System.out.println("out of loop ");
    }
}