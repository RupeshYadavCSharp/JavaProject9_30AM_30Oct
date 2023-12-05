package pack_searchARR;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int arr[], num;
        arr=new int[8];
        Scanner scan=new Scanner(System.in);
        System.out.println("enter array of 8 elements: ");
        for (int i = 0; i < 8; i++) {
            arr[i]=scan.nextInt();

        }
        System.out.println("enter number you want to search? ");
        num=scan.nextInt();
        for (int i = 0; i < 8; i++) {
            if(arr[i]==num)
            {
                System.out.println("number is found in array at"+ i);
            }

        }
    }
}
