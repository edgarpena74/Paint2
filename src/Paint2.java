import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // loop booleans
        boolean widthLoop = true;
        boolean heightLoop = true;

        // Prompt user to input wall's height
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                // Error handling for invalid input
                if (wallHeight == 0.0) {
                    System.out.println("Input must be greater than 0");

                } else if (wallHeight > 0.0) {
                    heightLoop = false;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
                scnr.next();
            }
        } while (heightLoop == true);

        // Prompt user to input wall's width
        do {
            try {
                System.out.println("Enter wall width (feet):");
                wallWidth = scnr.nextDouble();
                // Error handling for invalid input
                if (wallWidth == 0.0) {
                    System.out.println("Input must be greater than 0");

                } else if (wallWidth > 0.0) {
                    widthLoop = false;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
                scnr.next();
            }
        } while (widthLoop == true);

        // Close scanner
        scnr.close();

        System.out.println();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        cansNeeded = Math.ceil(gallonsPaintNeeded) * gallonsPerCan;
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
