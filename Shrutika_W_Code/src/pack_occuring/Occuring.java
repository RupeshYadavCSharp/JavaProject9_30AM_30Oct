package pack_occuring;

import java.util.Arrays;
import java.util.Scanner;

public class Occuring {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = scan.nextInt();

        }
        System.out.println("Enter any number: ");
        int num = scan.nextInt();
        int count =0;
        for(int i =0;i<size;i++)
        {
            if(arr[i]==num)
                count++;
        }
        System.out.println("count is: " + count);


    }
}
