package pack_searchARR;

import java.util.Scanner;

public class SearchInArray {
    public static int Search(int num,int arr[])
    {
        for (int i = 0; i < 8; i++) {
            if (num == arr[i]) {
                return i;
            }


        }
        return -1;

    }

    public static void main(String[] args) {
        int num, arr[];
        arr=new int[8];
        System.out.println("enter 8 elements of an array: ");
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            arr[i]=scan.nextInt();

        }
        System.out.println("enter num you want to search: ");
        num= scan.nextInt();
        int index=Search(num,arr);
        if(index==-1)
        {
            System.out.println("not");
        }
        else{
            System.out.println("found at "+ index);
        }

    }


}
