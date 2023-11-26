package pack_table;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        int num;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number for table");
        num = Scan.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "X" + i + ":" + num*i);
            
        }
    }
}
