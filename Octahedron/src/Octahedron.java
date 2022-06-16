import java.text.DecimalFormat;
         /**
          * Gets the ellipsoid's dimensions and volume.
          * Project 4
          * @author James Kirkley
          * @version September 18, 2020
          */
public class Octahedron {

         //instance variables
    private String label = "";
    private String color = "";
    private double edge = 0;



         //Constructor


         /**
          * finds the Octahedron's data.
          *@param labelln colorln edgeln input
          *@param edgeln input
          *@param colorln input
          */
    public Octahedron(String labelln, String colorln, double edgeln) {

        setLabel(labelln);
        setColor(colorln);
        setEdge(edgeln);
    }

         //methods
         /**
          *@return false
          *@param labelln input
          *@param
          */
    public boolean setLabel(String labelln) {
        if (labelln != null) {
            label = labelln.trim();
            return true;
        } else {
            return false;
        }

    }
         /**
          *@return label
          */
    public String getLabel() {
        return label;
    }

         /**
          *@return false
          *@param colorln input
          *@param
          */
    public boolean setColor(String colorln) {
        if (colorln != null) {
            color = colorln.trim();
            return true;
        } else {
            return false;
        }

    }
         /**
          *@return color
          */
    public String getColor() {
        return color;
    }

         /**
          *@return true false
          *@param edgeln input
          */
    public boolean setEdge(double edgeln) {
        if (edgeln > 1) {
            edge = edgeln;
            return true;

        } else {
            return false;
        }
    }
         /**
          *@return edge
          */
    public double getEdge() {
        return edge;
    }
         /**
          *@return surfaceArea
          */
    public double surfaceArea() {
        double surfaceArea = (2 * Math.sqrt(3) * Math.pow(edge, 2));
        return surfaceArea;
    }
         /**
          *@return volume
          */
    public double volume() {

        double volume = (Math.sqrt(2) / 3) * Math.pow(edge, 3);
        return volume;
    }
         /**
          *@return surfaceToVolumeRatio
          */
    public double surfaceToVolumeRatio() {
        double surfaceToVolumeRatio = surfaceArea() / volume();
        return surfaceToVolumeRatio;
    }

         /**
          *@return output
          */

    public String toString() {

        DecimalFormat df = new DecimalFormat("#,##0.0###");
        String output = "Octahedron \"" + label + "\" is \"" + color + "\"";
        output += " with 12 edges of length " + edge + " units.";
        output += "\n\tsurface area = " + df.format(surfaceArea());
        output += " square units" + "\n";
        output += "\tvolume = " + df.format(volume()) + " cubic units"  + "\n";
        output += "\tsurface/volume ratio = " + df.format(surfaceToVolumeRatio());
        return output;

    }

}
