package pack_replace;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements: ");
        for(int i = 0;i<size;i++ )
        {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("after replacement: ");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }


    }
}
