public class Car {
    private String make;
    private double fuelCapacity;
    private double milesPerGallon;
    private double gallonsInTank;
    
    public Car() { 
        this.make = null;
        this.fuelCapacity = 0.0;
        this.milesPerGallon = 0.0;
        this.gallonsInTank = 0.0;
    
    }
    public Car(String make, double fuelCapacity, double milesPerGallon, double gallonsInTank){
        this.make = make;
        this.fuelCapacity = fuelCapacity;
        this.milesPerGallon = milesPerGallon;
        this.gallonsInTank = gallonsInTank;
    }
    
    public String getMake() {
        return make;
    }
    
    public void set(String inputMake) {
        make = inputMake;
    }
    
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    
    public void setFuelCapacity(double inputFuelCapacity) {
        fuelCapacity = inputFuelCapacity;
    }
    
    public double getMilesPerGallon() {
        return milesPerGallon;
    }
    
    public void setMilesPerGallon(double inputMilesPerGallon) {
        milesPerGallon = inputMilesPerGallon;
    }
    
    public double getGallonsInTank() {
        return gallonsInTank;
    }
    
    public void setGallonsInTank(double inputGallonsInTank) {
        gallonsInTank = inputGallonsInTank;
    }
    
}