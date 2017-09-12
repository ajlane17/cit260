/*
 * This program reverses a person's name and repeats it back 'n' times
 */

 import java.util.Scanner;

 public class ReverseName {
     
    /**
     * The program starts in the main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // variables
        int userInt;
        String firstName;
        String welcomeMessage = "\nThis program reverses a first and last name.\n";
        String namePrompt = "\nPlease enter your first name:";
        String intPrompt = "\nPlease enter a number:";

        // greet the end-user
        System.out.println(welcomeMessage);
        
        // get a first name and a number
        Scanner inFile;
        inFile = new Scanner(System.in);

        System.out.println(namePrompt);
        firstName = inFile.nextLine();

        System.out.println(intPrompt);
        userInt = inFile.nextInt();

        inFile.close();

        output(firstName, userInt);
    }
    public static String reverseString(String name) {

        // return the provided name reversed
        name = new StringBuilder(name).reverse().toString();
        return name;
    }

    public static void output(String firstName, int i) {
        
        //output the reversed name 'n' times
        String reverseName = reverseString(firstName);
        
        System.out.println();
        while (i > 0) {
            System.out.println(reverseName);
            i--;
        }
    }
 }