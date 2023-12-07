package pack_replace01;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {

        int arr[] = new int[5];
        int max = arr[0];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array ");
        for (int i = 0; i < 5; i++) {

            arr[i] = scan.nextInt();
        }


        System.out.println("array is ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2==0) {
                arr[i]=1;

            }
            else{
                arr[i]=0;
            }

        }
        System.out.println("new 0-1 array is ");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

    }
}
