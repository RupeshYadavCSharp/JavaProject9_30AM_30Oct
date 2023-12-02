package pack_area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float l,b,area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length ");
        l = scan.nextFloat();
        System.out.println("Enter Breadth ");
        b = scan.nextFloat();
        area = l*b;
        System.out.println("Area is " + area);


    }
}
