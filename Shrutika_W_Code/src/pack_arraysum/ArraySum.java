package pack_arraysum;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int arr[]= new int[10];
        int sum;
        sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an array: ");

        for(int i = 0; i < 10 ;i++)
        {
            arr[i]=scan.nextInt();
            sum = sum + arr[i];

        }
        System.out.println("sum is " + sum);
    }
}
