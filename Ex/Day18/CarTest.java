public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("Honda", 15, 50);
		System.out.println(myCar.getMake() + " " +
		myCar.getFuelCapacity() + " gal. " +
		myCar.getMilesPerGallon() + " mpg. ");
		myCar.fillTank();
		System.out.println(myCar.getGallonsInTank() + " gal.");
		myCar.drive(50);
		System.out.println(myCar.getGallonsInTank() + " gal.");
		Car bobsCar = new Car("Ford", 20, 15);
		System.out.println(bobsCar.getMake() + " " +
		bobsCar.getFuelCapacity() + " gal. " +
		bobsCar.getMilesPerGallon() + " mpg. ");
		bobsCar.fillTank();
		System.out.println(bobsCar.getGallonsInTank() + " gal.");
		bobsCar.drive(50);
		System.out.println(bobsCar.getGallonsInTank() + " gal.");
	}
}