public class City
{
   private String name;
   private int population;

   public City()
   {
      name = "Alpha";
      population = 32000;
   }

   public City(String n, int p)
   {
      name = n;
      population = p;
   }

   public String getName()
   {
      return name;
   }

   public int getPop()
   {
      return population;
   }

  //Complete the toString() method
  public String toString() {
   return name + ", " + population;
  }



  //Complete the equals() method
  public boolean equals(Object obj) {
   return name.equals(((City)obj).getName()) && population == ((City)obj).getPop();
  }
  
}