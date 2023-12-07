package pack_search;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int size,index=-1;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter any number: ");
        int num = scan.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]==num)
            {
             flag = true;
             index = i;
             break;
            }
        }

        if(flag == true)
        {
            System.out.println("Number found at index " + index);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
