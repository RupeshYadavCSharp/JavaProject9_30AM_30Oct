package pack_Arrayy;

import java.util.Scanner;

public class Arr_todo {
    public static void main(String[] args) {
        int a = 0;
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 element for array ");
        for (int i = 0; i < 10; i++) {

            arr[i] = scan.nextInt();
        }
        for (int i = 0; i <10 ; i++) {
            a = a + arr[i];

        }
        System.out.println("Sum is " + a);
    }
}
