package Oops.Inheritance;

public class AnimalDogDriver
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		System.out.println("* Child Class Properties *");
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.type);
		
		Animal a=new Animal();
		System.out.println("* Parent Class Properties *");
		System.out.println(a.name);
		System.out.println(a.age);
		//System.out.println(a.type);//CTE
	}
}
class Animal 
{
String name="Ravin";
int age=6;
}

class Dog extends Animal
{
	String type="Labrador";
}
