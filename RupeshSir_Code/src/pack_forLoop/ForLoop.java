package pack_forLoop;

public class ForLoop
{
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++)
        {
            if( i == 5)
            {
                return;
            }

            System.out.print(i + "   ");
        }
        System.out.println("out of loop");
    }
}
