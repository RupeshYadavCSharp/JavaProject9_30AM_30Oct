package pack_dowhile;

import java.util.Scanner;

public class Negone {
    public static void main(String[] args) {
        int num;

        do{
            System.out.println("enter any number");
            Scanner scan= new Scanner(System.in);
            num=scan.nextInt();


            continue;


        }while(num!=-1);

    }
}
