
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
         /**
          * Program for orgranizing a ticket.
          *
          * Project 3
          * @author James Kirkley 1210-001
          * @version 9/14/2020
          */
public class TicketCode {
         /**
          * This is an Event organizer.
          * @param args not used
          */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String eventCode = "0";
        int eventCodeInt = Integer.parseInt(eventCode.trim());
        String date = "";
        String time = "";
        String resultPrice = "";
        String discount = "";
        String section = "";
        String row = "";
        String seat = "";
        String description = "";
        String cost = "0";
        String message = "";
        String eventCode1 = "";





        System.out.print("Enter ticket code: ");


        eventCode = userInput.nextLine();
        eventCode1 = eventCode;
        eventCode1 = (eventCode1.trim());

        System.out.println("");


        if (eventCode.length() >= 26) {

            System.out.print("Description: ");
            System.out.print(eventCode1.substring(25));

            System.out.print("   Date: ");
            System.out.print(eventCode1.substring(11, 13));
            System.out.print("/");
            System.out.print(eventCode1.substring(13, 15));
            System.out.print("/");
            System.out.print(eventCode1.substring(15, 19));

            System.out.print("   Time: ");
            System.out.print(eventCode1.substring(7, 9));
            System.out.print(":");
            System.out.println(eventCode1.substring(9, 11));


            System.out.print("Section: ");
            System.out.print(eventCode1.substring(19, 21));

            System.out.print("   Row: ");
            System.out.print(eventCode1.substring(21, 23));

            System.out.print("   Seat: ");
            System.out.println(eventCode1.substring(23, 25));

            DecimalFormat df = new DecimalFormat("$###.00");

            resultPrice = (eventCode1.substring(0, 5));
            double resultPriceD = Double.parseDouble(resultPrice);
            double resultPriceD2 = resultPriceD / 100;
            System.out.print("Price: " + df.format(resultPriceD2));

            DecimalFormat df1 = new DecimalFormat("00%");

            discount = (eventCode1.substring(5, 7));

            double discountD = Double.parseDouble(discount);

            discountD = discountD / 100;

            System.out.print("   Discount: " + df1.format(discountD));
            DecimalFormat df2 = new DecimalFormat("$#,##0.00");
            double costD = Double.parseDouble(cost);
            costD = resultPriceD2 * discountD;
            double costD2 = resultPriceD2 - costD;
            System.out.println("   Cost: " + df2.format(costD2));

            Random prizeN = new Random();
            int value = prizeN.nextInt(9999);
            System.out.println("Prize Number: " + value);

        }

       else {
            System.out.println("Invalid ticket code.");
            System.out.println("Ticket code must have at least"

                            + " 26 characters.");

        }

    }
}