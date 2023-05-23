package Oops.Inheritance;

class Computer
{
	String brand;
	String colour;
	double price;
	
	public void mathCalci()
	{
		System.out.println("Mathematical Calculation");
	}
}

class Laptop extends Computer
{
	public void wifi()
	{
		System.out.println("Using WIFI...");
	}
	public void hotspot()
	{
		System.out.println("Using Hotspot...");
	}
}

class Mobile extends Laptop
{
	Mobile(String brand,String colour,double price)
	{
		this.brand=brand;
		this.colour=colour;
		this.price=price;
	}
	public void calling()
	{
		System.out.println("Call Connecting...");
	}
	public void message()
	{
		System.out.println("Sending Message...");
	}
}

public class ComputerLapMobile_MultiLevel 
{
	public static void main(String[] args) {
		Mobile m=new Mobile("Redmi","Pink",14.999);
		System.out.println(m.brand);
		System.out.println(m.colour);
		System.out.println(m.price);
		m.wifi();
		m.hotspot();
		m.calling();
		m.message();
		m.mathCalci();
	}
}
