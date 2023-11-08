package pack_shruti_seasons;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        int month;
        System.out.println("enter any month number: ");
        Scanner scan = new Scanner(System.in);
        month=scan.nextInt();
        if(month==3 || month==4 || month==5)
        {
            System.out.println("Summer \uD83D ");
        } else if (month==6 || month==7 || month==8) {
            System.out.println("Rainy ☔\uD83C\uDF27 ");
            
        }
        else if (month==9 || month==10 || month==11) {
            System.out.println("Autumn \uD83C\uDF41 ");

        }
        else if (month==12 || month==1 || month==2) {
            System.out.println("Winter \uD83C\uDF84 ");

        }
        else
        {
            System.out.println("Invalid choice ⚠");
        }



    }
}
