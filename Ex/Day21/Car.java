public class Car {

  private String make;
  private double fuelCapacity;
  private double milesPerGallon;
  private double gallonsInTank;
  
  public Car(String make, double fuelCapacity, 
             double milesPerGallon) {
    if (fuelCapacity <= 0 || milesPerGallon <= 0) {
      throw new IllegalArgumentException();
    }
    this.make = make;
    this.fuelCapacity = fuelCapacity;
    this.milesPerGallon = milesPerGallon;  
  }
  public String     toString() {
    String s = "";
    s += "Make: " + make;
    s += "  Fuel Capacity: " + fuelCapacity;
    s += "  MPG: " + milesPerGallon;
    s += "  Gallons in Tank: " + gallonsInTank;
    return s;
  }
  
  public boolean equals(Object o) {
    if (o instanceof Car) {
      Car other = (Car)o;
      if (make.equals(other.make) &&
          fuelCapacity == other.fuelCapacity &&
          milesPerGallon == other.milesPerGallon &&
          gallonsInTank == other.gallonsInTank) {
         return true;
      }
      else {
        return false;
      }
    }
    else {
      return false;
    }
  }
  
  public String getMake() {
    return make;
  }
  public double getFuelCapacity() {
    return fuelCapacity;
  }
  public double getMilesPerGallon() {
    return milesPerGallon;
  }
  public double getGallonsInTank() {
    return gallonsInTank;
  }
  public void fillTank() {
    gallonsInTank = fuelCapacity;
  }
  public void addGas(double gallons) {
    if (gallons > 0) {
      if (gallons + gallonsInTank > fuelCapacity) {
        gallonsInTank = fuelCapacity;
      }
      else {
        gallonsInTank += gallons;
      }
    }
  }
  
  public void drive(int miles) {
    if (miles > 0) {
      double gasNeeded = miles/milesPerGallon;
      if (gallonsInTank > gasNeeded) {
        gallonsInTank -= gasNeeded;
      }
      else {
        gallonsInTank = 0;
      }
    }
  }
}
  
        
        
  
  
  
  
