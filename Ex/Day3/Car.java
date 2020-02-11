/**
This is a program for defining a car class and build objects from it
This is a program by Nicholas Loftin; nlloftin@ncsu.edu
Version 1
:3

**/
public class Car{

       /**
        *This instance variable keeps track of the speed of the car
        **/
        public double speed;
        public String color;
        public double mass;

        public void honk(){
                System.out.println("honking");
                
        }
        
        public double currentSpeed(){
                return (this.speed);

        /**
        * This method sets the speed of the car to an input speed.
        * @param inputSPeed this is the argument of the set speed message.
        **/

        }
        
        public void setSpeed(double inputSpeed){
        this.speed=inputSpeed;

        }

        public static void main(String[] args){
                //Making instances of the class Car.

                Car toyota = new Car();
                Car porche = new Car();
                //assign values to instance variables of these objects.
                toyota.speed=10.2;
                toyota.color="Blue";
                toyota.mass=1000;
                
                porche.speed=11;
                porche.color="red";
                porche.mass=1500;

                //sending messages to created instances of the class
                porche.honk();
                System.out.println(porche.currentSpeed());
                porche.setSpeed(50.0);
                System.out.println(porche.currentSpeed());


        }
}
