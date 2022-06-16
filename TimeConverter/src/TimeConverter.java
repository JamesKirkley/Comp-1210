import java.util.Scanner;
         /**
          * Program for converting time.
          *
          * project 2
          * @author James Kirkley 1210-001
          * @version 9/4/2020
          */
public class TimeConverter {
         /**
          * converts time.
          * @param args not used
          */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int raw = 0;
        int days = 0;
        int days2 = 0;
        int hours = 0;
        int hours2 = 0;
        int minutes = 0;
        int minutes2 = 0;
        int seconds = 0;

        System.out.print("Enter the raw time measurement in seconds: ");
        raw = userInput.nextInt();

        if (raw < 0) {
            System.out.println("Measurement must be non-negative!");
        }

       else{
            System.out.println("");
            System.out.println("Measurement by combined days,"
                            + " hours, minutes, seconds:");
            days = raw / 86400;
            days2 = raw % 86400;
            System.out.println("\tdays: " + days);
            hours = days2 / (3600);
            hours2 = days2 % 3600;
            System.out.println("\thours: " + hours);
            minutes = hours2 / 60;
            minutes2 = hours2 % 60;
            System.out.println("\tminutes: " + minutes);
            seconds = minutes2;
            System.out.println("\tseconds: " + seconds);
            System.out.println("");
            System.out.println(raw + " seconds = " + days + " days, "
                            + hours + " hours, " + minutes + " minutes, "
                            + seconds + " seconds");

        }
    }
}
