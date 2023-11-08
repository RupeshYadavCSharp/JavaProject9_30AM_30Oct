package pack_prathmesh_season;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        int M;
        System.out.println("ENter the month number: ");
        Scanner scan = new Scanner(System.in);
        M = scan.nextInt();
        if(M==3 || M==4 || M==5){
            System.out.println("Summer Season");
        }
        else if(M==6 || M==7 || M==8) {
            System.out.println("Rainy Season");
        }
        else if(M==9 || M==10 || M==11) {
            System.out.println("Autumn Season");
        }
        else if(M==12 || M==1 || M==2) {
            System.out.println("Winter Season");
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
