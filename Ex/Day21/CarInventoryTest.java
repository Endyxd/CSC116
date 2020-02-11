import java.io.*;
import java.util.*;
public class CarInventoryTest {

  public static void main(String[] args) throws FileNotFoundException{
    CarInventory carInventory = new CarInventory("cars.txt");
    System.out.println("\n " + carInventory.getNumberOfCars() +
                       " Cars in Inventory");
    System.out.println(carInventory);
    System.out.println("\nHonda? " + 
                       carInventory.findCar("Honda"));
    System.out.println("\nLexus? " + 
                       carInventory.findCar("Lexus"));
    /*System.out.println("Gallons Needed: " + 
                        carInventory.fillCarsWithGas());*/
  }
}
/*OUTPUT
csc% java CarInventoryTest

 5 Cars in Inventory
Make: Honda  Fuel Capacity: 15.0  MPG: 30.0  Gallons in Tank: 0.0
Make: Ford  Fuel Capacity: 20.0  MPG: 15.0  Gallons in Tank: 0.0
Make: Toyota  Fuel Capacity: 15.0  MPG: 25.0  Gallons in Tank: 0.0
Make: BMW  Fuel Capacity: 15.0  MPG: 18.0  Gallons in Tank: 0.0
Make: Acura  Fuel Capacity: 18.0  MPG: 20.0  Gallons in Tank: 0.0


Honda? Make: Honda  Fuel Capacity: 15.0  MPG: 30.0  Gallons in Tank: 0.0

Lexus? NOT FOUND
*/                       
