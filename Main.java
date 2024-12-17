import java.util.Scanner;


public class Main
{
   public static void main(String[] args)
   {
      double length; // To input a length
      double width;  // To input a width

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the dimensions of tract 1.
      System.out.println("TRACT 1:");
      System.out.print("Enter the length of Tract 1: ");
      length = keyboard.nextDouble();
      System.out.print("Enter the width of Tract 1: ");
      width = keyboard.nextDouble();

      // Create a LandTract object for tract 1.


      // Get the dimensions of tract 2.
      System.out.println("\nTRACT 2:");
      System.out.print("Enter the length of Tract 2: ");
      length = keyboard.nextDouble();
      System.out.print("Enter the width of Tract 2: ");
      width = keyboard.nextDouble();

      // Create a LandTract object for tract 2.

      
      // Display the land tract data.
      System.out.println("\nTRACT 1:");
      System.out.println(tract1);
      System.out.println("TRACT 2:");
      System.out.println(tract2);
      
      // Determine whether the two tracts are equal.

   }
}