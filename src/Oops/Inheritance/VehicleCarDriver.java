package Oops.Inheritance;
class Vehicle {
	
	String brand="Honda";
	double price=800000.0;
	String colour="Silver";
}

class Car extends Vehicle
//"extends" inherits all the properties from Parent Class
{
	String model="Honda City";
	String type="Diesel";
}

public class VehicleCarDriver {
	public static void main(String[] args) {
		
				
		Car c=new Car();// Creating Object For Child Class
		//By Using Child Class Ref.var 'c' we can access Parent class Memberss
			System.out.println("* Child Class Properties *");
			System.out.println(c.brand); //Pc property
			System.out.println(c.price); //Pc
			System.out.println(c.colour); //Pc
			System.out.println(c.model); //Cc
			System.out.println(c.type); //Cc
				
				System.out.println("* Parent Class Properties *");
				Vehicle v=new Vehicle(); //Creating Object For Parent Class
				//Using Parent class Ref.var we cant access Child class Members
				System.out.println(v.brand);
				System.out.println(v.price);
				System.out.println(v.colour);
				//System.out.println(v.model);//CTE
				//System.out.println(v.type);//CTE
			}
	}


