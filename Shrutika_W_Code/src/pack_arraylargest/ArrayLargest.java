package pack_arraylargest;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLargest {
    public static void main(String[] args) {
        int size;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter size ");
        size = scan.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = scan.nextInt();


        }
        Arrays.sort(arr);

        System.out.println("largest " + arr[size-1 ] ); // 34 45 56 56


    }
}
