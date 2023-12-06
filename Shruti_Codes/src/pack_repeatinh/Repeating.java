package pack_repeatinh;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size, num, arr[];


        System.out.println("size? ");
        size = scan.nextInt();
        int newarr[]=new int [size];
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("these are repeated: ");

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }

        }



    }
}
