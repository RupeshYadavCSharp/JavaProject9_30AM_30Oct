package pack_Arrlargestnumber;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLarge
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size,sl = 0,l = 0;
        System.out.println("Enter size of array ");
        size = scan.nextInt();

        int []arr = new int[size];
        System.out.println("Enter elements ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scan.nextInt(); //78 34  11 78  12
        }

        Arrays.sort(arr);          //11  78   78  78  78

        l = arr[size - 1];          //l = 78

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
