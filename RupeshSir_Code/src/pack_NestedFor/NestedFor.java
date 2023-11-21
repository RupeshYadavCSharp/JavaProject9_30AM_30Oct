package pack_NestedFor;

public class NestedFor
{
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++)   //i = 1   2
        {
            for (int j = 1; j <=5 ; j++) //j = 1 2 3 4 5
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
