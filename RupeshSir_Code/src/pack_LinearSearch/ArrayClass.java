package pack_LinearSearch;

import java.util.Scanner;

public class ArrayClass
{
    public static void main(String[] args) {

        int size,index = -1;
        boolean flag = false;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array ");
        size = scan.nextInt();

        int []arr = new int[size];
        System.out.println("Enter elements ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt(); //10 45  23  15  90
        }

        System.out.println("Enter any number to search ");
        int num = scan.nextInt();    //23

        for (int i = 0; i < size; i++)
        {
            if(arr[i] == num)
            {
                    flag = true;
                    index = i;
                    break;
            }
        }

        if(flag == true)
        {
            System.out.println("Found at index " + index);
        }
        else
        {
            System.out.println("not found ");
        }





    }
}
