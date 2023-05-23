package Oops.Inheritance;

class Bicycle
{
int speed;
String colour;

Bicycle()
{

}

Bicycle(int speed,String colour)
{
this.speed=speed;
this.colour=colour;
}

public void cycling()
{
	System.out.println("I'm Cycling...");
}

public void applyBreak()
{
	System.out.println("Applied Break...");
}
}


class MountainCycle extends Bicycle
{
	int gear;
	
	MountainCycle(int speed, String colour,int gear)
	{
		this.speed=speed;
		this.colour=colour;
		this.gear=gear;
	}
	
	public void speedUp()
	{
		System.out.println("Speed Up... ");
	}
}
public class Bicycle_SingleLevel
	{
	public static void main(String[] args)
	{
		Bicycle b=new Bicycle(30,"Neon Green");
		System.out.println(b.speed);
		System.out.println(b.colour);
		
		MountainCycle mc=new MountainCycle(30,"Neon Green",5);
		System.out.println(mc.gear);
		System.out.println(mc.speed);
		System.out.println(mc.colour);	
	}	
	}

