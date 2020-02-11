
/*
*	This is a program to calculate wind speed
*	@ nlloftin@ncsu.edu
*	Version 1.4
* 	:3
*/

//formula Pow = eff * 1/2 * density * Area of blades * velocity^3
public class WindPowerCalculator{
		
		public static double calculateWindPower(int efficiency, int bladesDiameter, int velocity){
	//		double e = this.min_eff; //efficiency declaration
			double output = 0; // setting output to arbitrary value
            double e = ((double)efficiency/100);
			double dens = density; // density delcaration
			double radius = ((double)bladesDiameter/2); //this declaration calculates the radius from the diameter as to not clutter the next variable
			double area = Math.PI*Math.pow(radius, 2); //After using the radius variable, we now use it to declare the area we need for the equsn.
			//This is for when the method is called, it simply states the number for the velocity and lists the rest
					output = (e*0.5*dens*area* (double)Math.pow(velocity, 3)/watts_p_kilowatt);
					return output;
					
					
					
		}
	
		// these are the public static variables that must e declared fxor the calculator
		public static final int diameter = 110; //m
		public static final double density = 1.225; //kg/m^3
		public static final int min_v = 4; //m/secc
		public static final int max_v = 19; //m/sec
		public static final int min_eff = 20; //percent
		public static final int max_eff = 40; //percent
		public static final int eff_inc = 10; //percent inc
		public static final int watts_p_kilowatt = 1000;

		public static void main(String[] args){
			WindPowerCalculator wPC = new WindPowerCalculator();
           
			int e = min_eff;
			//This is the beginning of the program, to get the graph prepared before calling on the other method.
			System.out.printf("%8s %15s", "Wind", "Turbine\n");
			System.out.printf("%10s %14s", "Velocity", "Efficiency\n");
			System.out.printf("%20s %20s %20s", "20%", "30%", "40%\n");
			System.out.println("--------------------------------------------------------------------------");
			//This int is created to easily send from the main method to the sub method
			int velocity = min_v;
			
			double out;
			//Param: velocity must be less than or equal to the maximum possible velocity
			//This loop will end after the velocity reaches the maximum of 19
			for(velocity=velocity; velocity <= max_v; velocity++){
                System.out.print("     " + velocity + ": ");                
  					//This will display the outcome of the equation, which will be new every time this for loop executes
        
					for(e=e; e<= max_eff; e+= eff_inc){
                        out = wPC.calculateWindPower(e, diameter, velocity);
                        System.out.printf("%20d", (int)out);
                        
                
                    }
                    System.out.println("     ");
                e = min_eff;
            }
        }
}