/** This class implements an oven.
* @author Nicholas Loftin
* @ version 1
*/

public class Oven{
		/** This is an instance variable to keep the temperature of the oven.*/
		public float temp;
		
		public void selfClean(){
			System.out.println("Self clean started");
		}
	
	public void setTemp(float inpTemp){
		this.temp=inpTemp;
		
		
	}
	
	public float getTemp(){
		return(this.temp);
	}
	// This is a method to increase the temperature by a specified ammount.
	// @param inctemp Specified temparatrue to be added to the current temperature
	// @return the final temperature value
	public float incTemp(float incTemp){
		this.temp = this.temp+incTemp;
		return (this.temp);
	}
	
	public static void main(String[] args){
			Oven ov = new Oven();
			ov.selfClean();
			ov.setTemp(40);
			System.out.println(ov.getTemp());
			float curTemp = ov.getTemp();
			System.out.println(ov.incTemp(30));
			
		
	}
	
	
	
	
	
}