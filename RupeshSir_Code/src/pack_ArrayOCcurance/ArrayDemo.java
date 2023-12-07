package pack_ArrayOCcurance;

import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter size of array ");
        size = scan.nextInt();

        int []arr = new int[size];
        System.out.println("Enter elements ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt(); //10 20 30 10 20
        }

        System.out.println("Enter any number ");
        int num = scan.nextInt();    //20
        int count = 0;

        for (int i = 0; i < size; i++)
        {
              if(arr[i] == num)
              {
                  count++;
              }
        }

        System.out.println("count is " + count);


    }
}
