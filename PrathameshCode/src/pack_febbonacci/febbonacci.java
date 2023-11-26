package pack_febbonacci;

import java.util.Scanner;

public class febbonacci {
    public static void main(String[] args) {
        int num,p=0,s=1,v;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scan.nextInt();
        if(num<0)
        {
            System.out.println("The febbonacci series is");
            System.out.print(p + " ");
            System.out.print(s + " ");
            for (int i = 0; i < num; i++) {
                v = p + s;
                p = s;
                s = v;
                System.out.print(v + " ");
            }
        }
        else{
                    System.out.println("Enter valid Number");
            }


    }
}
