package pack_mahindra;

public class mahindra {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if(j<=i || j>=11-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();


        }
        for (int k = 1; k <=5 ; k++) {
            for (int l = 1; l <=10 ; l++) {
                if(6-k>=l || k+5<=l){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
