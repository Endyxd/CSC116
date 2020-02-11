
/*
*	This is a program to calculate wind speed
*	@ nlloftin@ncsu.edu
*	Version 1
* 	:3
*/

//formula Pow = eff * 1/2 * density * Area of blades * velocity^3
public class windPowerCalc{
	
		public double calculateWindPower{
			int pow = this.watts_p_kilowatt;
			int e = this.min_eff;
			int velocity = this.min_v;
			double dens = this.density;
			double output;
			double area = Math.PI*Math.pow(this.diameter, 2); // I may be using the wrong area... I used half the diam and use circle calculation
			for(velocity; velocity <= this.max_v; velocity++){
				for(e; e<= this.max_eff; e+= this.eff_inc){
					output = (double)pow*0.5*(double)dens*area*Math.pow(velocity, 3);
					System.out.printf("%5d", output); 
					
					
				}
				
			}
		}
	
	
		public static final int diameter = 110; //m
		public static final double density = 1.225; //kg/m^3
		public static final int min_v = 4; //m/secc
		public static final int max_v = 19; //m/sec
		public static final int min_eff = 20; //percent
		public static final int max_eff = 40; //percent
		public static final int eff_inc = 10; //degrees
		public static final int watts_p_kilowatt = 1000;

		public static void main(String[] args){
			int min = this.min_v;
			int max = this.max_v;
			windPowerCalc wPC = new windPowerCalc();
			wPC.calculateWindPower();
		//	for(int i = min; i <= max; i++){
			//make for loop that just replays the calculate method
				
				
			}
		}
	
	
	
}