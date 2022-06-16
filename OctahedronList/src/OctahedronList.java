
import java.util.ArrayList;

import java.text.DecimalFormat;

/**

 * Program for storing the name of the list.

 *

 * project 5

 * @author James Kirkley 1210-001

 * @version 9/25/2020

 */

public class OctahedronList {

    private String listName;

    private ArrayList<Octahedron> octObjList;

    /**

     @param listNameIn input for the listName

     @param octObjListIn input for the octObjList

     */

    public OctahedronList(String listNameIn, ArrayList<Octahedron>

            octObjListIn) {

        listName = listNameIn;

        octObjList = octObjListIn;

    }

    /**

     @return returns the name of the list

     */

    public String getName() {

        return listName;

    }

    /**

     @return retuns the total number of objs in the array

     */

    public int numberOfOctahedrons() {

        return octObjList.size();

    }

    /**

     @return returns the total surface area

     */

    public double totalSurfaceArea() {

        double total = 0;

        int index = 0;

        while (index < octObjList.size()) {

            total += octObjList.get(index).surfaceArea();

            index++;

        }

        return total;

    }

    /**

     @return returns the total volume

     */

    public double totalVolume() {

        double total = 0;

        int index = 0;

        while (index < octObjList.size()) {

            total += octObjList.get(index).volume();

            index++;

        }

        return total;

    }

    /**

     @return returns the average surface area

     */

    public double averageSurfaceArea() {

        double total = 0;

        int index = 0;

        while (index < octObjList.size()) {

            total += (octObjList.get(index).surfaceArea()) / octObjList.size();

            index++;

        }

        return total;

    }

    /**

     @return returns the average volume

     */

    public double averageVolume() {

        double total = 0;

        int index = 0;

        while (index < octObjList.size()) {

            total += (octObjList.get(index).volume()) / octObjList.size();

            index++;

        }

        return total;

    }

    /**

     @return return the average surfaec to volume ratio

     */

    public double averageSurfaceToVolumeRatio() {

        double total = 0;

        int index = 0;

        while (index < octObjList.size()) {

            total += octObjList.get(index).surfaceToVolumeRatio()

                    / octObjList.size();

            index++;

        }

        return total;

    }

    /**

     @return returns the obj atributes

     */

    public String toString() {

        String finalString = "";

        int index = 0;

        while (index < octObjList.size()) {

            finalString = "\n" + octObjList.toString() + "\n";

            index++;

        }

        return "\n" + listName + "\n" + finalString;

    }

    /**

     @return returns the summary of the array

     */

    public String summaryInfo() {

        DecimalFormat df1 = new DecimalFormat("#,##0.0##");

        return "----- Summary for " + listName + " -----\n"

                + "Number of Octahedrons: " + octObjList.size() + "\n"

                + "Total Surface Area: " + df1.format(totalSurfaceArea()) + "\n"

                + "Total Volume: " + df1.format(totalVolume()) + "\n"

                + "Average Surface Area: " + df1.format(averageSurfaceArea()) + "\n"

                + "Average Volume: " + df1.format(averageVolume()) + "\n"

                + "Average Surface/Volume Ratio: "

                + df1.format(averageSurfaceToVolumeRatio());

    }

}
