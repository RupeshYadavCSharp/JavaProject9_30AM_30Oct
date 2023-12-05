package pack_arraydemo;

import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String[] args) {

        int arr[] = new int[5];
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



    }
}
