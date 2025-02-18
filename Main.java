// Object Starter      A+CR
public class Main 
{
  public static void main(String[] args) 
  {
     City A = new City();
     City B = new City("Alpha", 32000);

     System.out.println(A);
     System.out.println(B);

     if(A.equals(B))
        System.out.println("Same");
     else
        System.out.println("Different");
  }
}