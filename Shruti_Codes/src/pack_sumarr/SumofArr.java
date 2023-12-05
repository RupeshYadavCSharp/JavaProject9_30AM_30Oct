package pack_sumarr;

import java.util.Scanner;

public class SumofArr {
    public static void main(String[] args) {
        int sum=0;
        int arr[]=new int[10];
        Scanner scan= new Scanner(System.in);
        System.out.println("enter array of 10 elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i]=scan.nextInt();


        }
        System.out.println("array is: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);


        }

        for (int i = 0; i < 10; i++) {
            sum=sum+arr[i];


        }
        System.out.println(" sum of the araay is: "+sum);

    }
}
