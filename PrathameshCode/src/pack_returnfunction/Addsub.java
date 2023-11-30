package pack_returnfunction;

import java.util.Scanner;

public class Addsub {
    public static int add(int a, int b){
        int c;
        c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int a,b,addab;
        System.out.println("enter any number");
        Scanner Scan = new Scanner(System.in);
        a = Scan.nextInt();
        System.out.println("enter any number");
        b = Scan.nextInt();
        addab = add(a,b);
        System.out.println("The sum is " + addab);

    }
}
