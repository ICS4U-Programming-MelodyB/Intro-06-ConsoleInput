import java.util.Scanner;

/**
* The Program calculates the area of a circle in Java.
*
* @author  Melody Berhane
* @version 1.0
* @since   2023-2-10
*/
public final class AreaCircle {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private AreaCircle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Welcome to Melody's Area of a Circle Program!");
        System.out.print("Enter the radius of the circle (cm): ");

        // Using Scanner for Getting Input for User
        final Scanner scanner = new Scanner(System.in);
        final String radString = scanner.nextLine();

        // Convert the string to a double
        final double radDouble = Double.parseDouble(radString);

        // If radius is negative, tell the user
        if (radDouble < 0) {
            System.out.println("The radius cannot be negative.");
        } else {
            // Calculate the area
            final double area = Math.PI * Math.pow(radDouble, 2);

            // Display the area, round to 2 decimal places
            System.out.print("The area of a circle with radius, ");
            System.out.print(radString + "cm, is ");
            System.out.format("%.2f", area);
            System.out.println("cm^2.");
        }

        // Closing Scanner
        scanner.close();
    }
}
