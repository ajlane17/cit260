/*
 * This program converts pounds into kilograms
 */

import java.util.Scanner;

public class ConvertWeight {

    private final static double KILOGRAMS_PER_POUND = 0.453592;

    /**
     * The program starts in the main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // print out the welcome message
        System.out.println();
        System.out.println("This program converts pounds into kilograms");

        // prompt to enter the user's name
        System.out.println("\nPlease enter your name:");

        //create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);

        // read the value of the next line typed into the console
        String name = inFile.nextLine();
        
        // prompt to enter the user's weight
        System.out.println("\nPlease enter your weight in pounds:");

        // prompt to enter the weight in pounds
        double weightInPounds = inFile.nextDouble();

        // close the input file because we are done with it
        inFile.close();

        // convert the weight to kilograms
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;

        // display weight in kilograms to the console
        String output = "\n****************" +
                        "\nName: " + name +
                        "\nWeight: " + weightInKilograms +
                        "\n****************";
        System.out.println(output);
    }
}