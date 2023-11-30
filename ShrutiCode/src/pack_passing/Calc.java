package pack_passing;

import java.util.Scanner;

public class Calc {
    public  int add(int a,int b){
        int sum;
        sum=a+b;
        return sum;
    }


    public static void main(String[] args) {
        int a, b, addi;
        System.out.println("enter a: ");
        Scanner scan= new Scanner(System.in);
        a=scan.nextInt();


        System.out.println("enter b: ");

        b=scan.nextInt();


        Calc calc = new Calc();
        addi=calc.add(a,b);
//        addi=add(a, b);
        System.out.println("sum is " + addi);




    }
}
