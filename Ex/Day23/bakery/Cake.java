/**
 * Bake and sell Cake's
 * @author Suzanne Balik, 14 Mar 2002
 */
public class Cake {

  //All Cake's share this flour!
  private static int poundsOfFlourAvailable = 50; 
                                
  
  private String name;            
  
  private int costInDollars;            
  
  private int poundsOfFlourNeeded;      

  public Cake(String name, int costInDollars, int poundsOfFlourNeeded){
  
    this.name = name;
    this.costInDollars = costInDollars;
    this.poundsOfFlourNeeded = poundsOfFlourNeeded;
    
  }
  
  public boolean bake() {
  
    if (poundsOfFlourNeeded <= poundsOfFlourAvailable) {
      poundsOfFlourAvailable -= poundsOfFlourNeeded;
      return true;
    }
    else
      return false;
  }
  
  public String getReceipt() {
  
    String s = "";
    s += name;
    s += "  $" + costInDollars + ".00";
    return s;
  }
  
  public static void main(String[] args) {
  
    Cake cake = new Cake("Chocolate Cake", 10, 3);
    
    System.out.println(cake.getReceipt());
    
    int numberOfCakes = 0;
    
    //poundsOfFlourAvailable is accessible
    //to main method since it is a static variable
    int poundsOfFlour = poundsOfFlourAvailable; 
    
    while (cake.bake())
      numberOfCakes++;
      
    System.out.println("Baked " + numberOfCakes + " cakes with " + 
                        poundsOfFlour + " pounds of flour");
  }
}

/* OUTPUT:
csc% java Cake
Chocolate Cake  $10.00
Baked 16 cakes with 50 pounds of flour 
*/
