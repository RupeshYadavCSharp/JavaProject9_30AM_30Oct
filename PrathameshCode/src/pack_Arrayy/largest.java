package pack_Arrayy;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int max = arr[0];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 element for array ");
        for (int i = 0; i < 5; i++) {

            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("The largest Number is " + max) ;


    }
}
