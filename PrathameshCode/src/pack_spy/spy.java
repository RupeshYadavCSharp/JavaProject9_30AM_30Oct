package pack_spy;

import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        int num,count,ten=10;
        System.out.println("Enter any number");
        Scanner Scan = new Scanner(System.in);
        num = Scan.nextInt();
        if(num<0){
            num = num * -1;
        }
        count = 0;
        while(num > 0){
           num = num / 10;
            count = count + 1;
        }
        for (int i = 1; i <= count ; i++) {
            ten = ten*10;
        }
        System.out.println(ten);

    }
}
