/**
* This is a program to show different dogs in different classes
*	Nicholas Loftin @ nlloftin@ncsu.edu
*	Version 1
*	:3
**/
public class dog{
	public int weight;
	public int barkingpotential;
	public int height;
		
	public void bark(){
			for(int barking = 0;barking < barkingpotential;barking++){
			System.out.print("BARK");
			
			}
		System.out.println(" ");
	}
	// barkbarkbarkbarkbarkbarkbark 
	
	public int dogweight(){
		return (this.weight);
		
		
	}
	
	public int dogheight(){
		return (this.height);
		
	}
		//These weight and height sections are just to show that I can use classes to 
		
		public static void main(String[] args){
			dog Rosie = new dog();
			dog missRed = new dog();
			//(My dogs)
			Rosie.barkingpotential = 5;
			missRed.barkingpotential = 9;
			
			Rosie.weight=40;
			missRed.weight=20;
			
			Rosie.height = 4;
			missRed.height = 2;
			System.out.print("Miss red: ");
			missRed.bark();
			System.out.print("Rosie: ");
			Rosie.bark();
			System.out.println("Miss red weight: " + missRed.dogweight());
			System.out.println("Miss red height: " + missRed.dogheight());
			//showing miss reds height and weight
			System.out.println("rosies weight" + Rosie.dogweight());
			System.out.println("rosies height " + Rosie.dogheight());
			//showing rosies height and weight
			
		}




}