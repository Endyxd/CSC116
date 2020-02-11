import java.util.*;
import java.io.*;

public class CarInventory{
	Car[] cars;

	public CarInventory(String fileName){
		try{
			int count=0;
			Scanner input=new Scanner (new File(fileName));
			while(input.hasNextLine()){
				input.nextLine();
				count++;
			}

			input.close();
			input=new Scanner (new File(fileName));
			cars=new Car[count];

			for(int i=0;i<count;i++){
				String line=input.nextLine();
				Scanner token=new Scanner(line);
				cars[i]=new Car(token.next(),token.nextDouble(),token.nextDouble());
			}
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.exit(1);
		}

	}

	public int getNumberOfCars(){
		return cars.length;
	}
    
    public String findCar(String search) throws FileNotFoundException{
        Scanner in = new Scanner(new File("cars.txt"));
        do{
            String Name = "";
            String line = in.nextLine();
            Scanner inName = new Scanner(line);
            try{
                Name = inName.next();
            }catch(InputMismatchException e){
                in.nextLine();
            }
            if(Name.equals(search)){
                String returnStr = toString();
                return returnStr;
            }
        }while(in.hasNextLine());
        return "NOT FOUND";
    }



}