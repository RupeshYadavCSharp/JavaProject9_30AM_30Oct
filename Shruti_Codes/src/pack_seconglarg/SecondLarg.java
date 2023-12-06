package pack_seconglarg;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLarg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size, arr[];
        System.out.println("size? ");
        size = scan.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
        Arrays.sort(arr);

        int largest = arr[size - 1];    //78
        int snd = largest;              //78

        for (int i = size-2; i >= 0; i--) {
            if (arr[i]  <  largest)
            {

                snd=arr[i];
                break;

            }
        }
        System.out.println("second largest is " + snd);

    }
}
