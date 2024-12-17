/**
   The LandTract class stores data about a tract of land
   for the LandTract Class programming challenge.
*/

public class LandTract
{
   private double length;     // Length of the tract
   private double width;      // Width of the tract
   
   /**
      Constructor
      @param len The length of the land tract.
      @param w The width of the land tract.
   */

   public LandTract(double len, double w)
   {
      length = len;
      width = w;
   }

   /**
      getArea method
      @return The area of the land tract in square feet.
   */
   
   public double getArea()
   {
      return length * width;
   }
   
   /**
      The equals method compares two LandTract objects.
      @param tract2 A reference to a LandTract object.
      @return true if the two tracts are the same size,
              false otherwise.
   */
      
   public boolean equals(LandTract tract2)
   {

   }
   
   /**
      toString method
      @return A string indicating the land tract's length,
              width, and area.
   */
   
   public String toString()
   {

   }
}