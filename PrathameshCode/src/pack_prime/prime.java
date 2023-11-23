package pack_prime;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i<= n; i++){
            if( n <= 3){
                System.out.println("Prime");
                break;
            }else if( n%i ==0){
                System.out.println("Not Prime");
                break;
            }else{
                System.out.println("Prime");
            }
        }
    }
}
