package pack_largestarr;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {

        int arr[] = new int[5];
        int max=arr[0];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array ");
        for (int i = 0; i < 5; i++) {

            arr[i] = scan.nextInt();
        }


        System.out.println("array is ");
        for(int i = 0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < 5; i++) {
            if(arr[i]>=max)
            {
                max=arr[i];

            }

        }
        System.out.println("largest number is: "+ max);
    }
}
