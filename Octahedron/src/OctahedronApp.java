import java.util.Scanner;

         /**
          * Program for getting the Octahedron's data.
          *
          * project 4
          * @author James Kirkley 1210-001
          * @version 9/18/2020
          */
public class OctahedronApp {
         /**
          *program to insert info into main program.
          *@param args not used
          */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.print("Enter label, color, and "
                        + "edge length for an octahedron." + "\r\n"
                        + "\tlabel: ");
        String label = userInput.nextLine();

        System.out.print("\tcolor: ");
        String color = userInput.nextLine();

        System.out.print("\tedge: ");
        double edge = userInput.nextDouble();
        if (edge < 0) {
            System.out.println("Error: edge must be non-negative.");
            return;
        }
        Octahedron myObj;
        myObj = new Octahedron(label, color, edge);
        System.out.println("\n" + myObj);



    }

}
