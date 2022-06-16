import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

/**
 * Program for storing the name of the list.
 *
 * project 5
 * @author James Kirkley 1210-001
 * @version 9/25/2020
 */

public class OctahedronListApp {

    /**
     @param args comandline args not used
     */

    public static void main(String[] args) throws FileNotFoundException {

                ArrayList<Octahedron> octObjList = new ArrayList<Octahedron>();

        String listName = "";

        String label = "";

        String color = "";

        double edge;


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter file name: ");

        String fileName = scan.nextLine();


        Scanner scanFile = new Scanner(new File(fileName));

        listName = scanFile.nextLine();


        while (scanFile.hasNext()) {

            label = scanFile.nextLine();

            color = scanFile.nextLine();

            edge = Double.parseDouble(scanFile.nextLine());


            Octahedron octObj = new Octahedron(label, color, edge);

            octObjList.add(octObj);

        }

        OctahedronList myList = new OctahedronList(listName, octObjList);


        System.out.println(myList.toString());

        System.out.println(myList.summaryInfo());

    }

}
