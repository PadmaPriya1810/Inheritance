package Oops.Inheritance;

class Calculator
{
	String brand;
	double price;
	
	Calculator() // Why getting Error? if there is no "No Arg Constructor"
	{
		
	}
	Calculator(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	public void add()
	{
		System.out.println("Addition");
	}
	public void sub()
	{
		System.out.println("Subtraction");
	}
	public void mul()
	{
		System.out.println("Multiplication");
	}
	public void div()
	{
		System.out.println("Division");
	}
}

class ScientificCalci extends Calculator
	{
	
	ScientificCalci(String brand,double price) //Implicit super cnstructor Calculator() is undefined
	{										   //Must Explicitly invoke another Constructor
	this.brand=brand;
	this.price=price;
	}
	
	public void square()
	{
		System.out.println("Square");
	}
	public void cube()
	{
		System.out.println("Cube");
	}
}

public class Calculator_SingleLevel 
{
public static void main(String[] args)
{
	Calculator c=new Calculator("Casio",500.0);
	System.out.println(c.brand);
	System.out.println(c.price);
	
	ScientificCalci sc=new ScientificCalci("SCIENTIFIC_CASIO",1000.0);
	System.out.println(sc.brand);
	System.out.println(sc.price);
	sc.add();
	sc.sub();
	sc.mul();
	sc.div();
	sc.square();
	sc.cube();

}	
}
