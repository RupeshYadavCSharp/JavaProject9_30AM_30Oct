package pack_occurence;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size, num,arr[];
        int count=0;
        System.out.println("size? ");
        size = scan.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("number? ");
        num=scan.nextInt();

        for (int i = 0; i < size; i++) {
            if(num==arr[i])
            {
                count++;
            }

        }
        System.out.println(num+ "is repeated "+ count+ " times");


    }
}
