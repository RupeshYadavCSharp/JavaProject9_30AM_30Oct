package pack_DOB;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DOb {
    public static void showDOB()
    {
        int y,m,d;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter year of birth");
        y = scan.nextInt();
        System.out.println("Enter month of birth");
        m = scan.nextInt();
        System.out.println("Enter day of birth");
        d = scan.nextInt();
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        String yDate = dateFormat.format(date);
        DateFormat monthFormat = new SimpleDateFormat("mm");
        String mDate = monthFormat.format(date);
        DateFormat dayFormat = new SimpleDateFormat("dd");
        String dDate = dayFormat.format(date);
        System.out.print("you are ");
        System.out.print((Integer.valueOf(yDate) - y )+ " years " + (Integer.valueOf(mDate) - m + " months " )+ (Integer.valueOf(dDate) + " days "));

    }


    public static void main(String[] args) {

        DOb Objdob = new DOb();
        Objdob.showDOB();




    }
}
