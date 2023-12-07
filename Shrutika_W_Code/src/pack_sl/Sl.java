package pack_sl;

import java.util.Arrays;
import java.util.Scanner;

public class Sl {
    public static void main(String[] args) {
        int size,sl=0,l=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array ");
        size = scan.nextInt();

        int []arr = new int[size];
        System.out.println("Enter elements ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        l = arr[size - 1];

        sl = l;

        for(int i = size - 2; i>=0; i--)
        {
            if(arr[i] < l )
            {
                sl = arr[i];
                break;
            }
        }

        System.out.println("second largest is " + sl);




    }
}

