package pack_repeating;

import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }

        int repeatedarr[] = new int[size];
        int n = 0;

        System.out.println("Following numbers are repeating: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j])
                {
                    boolean flag = false;
                    for(int k = 0; k<=n; k++)
                    {
                         if(repeatedarr[k] == arr[i])
                         {
                             flag = true;
                             break;
                         }
                    }

                    if(flag == false)
                    {
                        repeatedarr[n] = arr[i];
                        n++;
                    }

                    break;

                }
            }
        }

        System.out.println("repeated numbers are ");
        for (int i = 0; i <n; i++)
        {
            System.out.println(repeatedarr[i]);
        }
    }
}
