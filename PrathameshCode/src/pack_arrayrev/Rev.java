package pack_arrayrev;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        int num;
        System.out.println("enter size of array");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter element for array ");
        for (int i = 0; i < num; i++) {

            arr[i] = scan.nextInt();
        }

        int first = 0, last = num-1;

        while(first<last){
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println("the reverse array is ");
        for(int i=0; i<num; i++)
            System.out.print(arr[i]+" ");
    }
            


}
