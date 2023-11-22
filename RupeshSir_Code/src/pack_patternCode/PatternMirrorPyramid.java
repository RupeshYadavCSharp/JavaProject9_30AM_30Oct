package pack_patternCode;

public class PatternMirrorPyramid
{
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++)
        {
            for (int j = 1; j <=10 ; j++)
            {
                 if(j <=i || j>=11-i)
                 {
                     System.out.print("* ");
                 }
                 else
                 {
                     System.out.print("  ");
                 }
            }
            System.out.println();
        }
    }
}
