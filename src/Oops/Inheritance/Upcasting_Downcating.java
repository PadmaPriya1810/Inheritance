package Oops.Inheritance;
//Upcasting & Downcasting Basic
class A
{
	int i=5;
}

class B extends A //RULE: IS-A Relationship Mandatory for Upcasting & Downcasting
{
	int j=10;
}

public class Upcasting_Downcating
{
public static void main(String[] args) {
	A a=new A();
	System.out.println(a.i);
	
	B b=new B();
	System.out.println(b.i);
	System.out.println(b.j);
	
	A a1=new B();//UPCASTING - Implicity Compiler/Programmer Can do.
	System.out.println(a1.i);//Only 'i' is present in A type/Class
	//System.out.println(a1.j);//CTE - We cant Access Child Class Members Using Upcasting
	
	A a2=new B();//Before DOWNCASTING, Need to Do UPCASTING
	B b2=(B)a2; //DOWNCASTING
	System.out.println(b2.i);// Can Access Parent Class 'i'
	System.out.println(b2.j);//As well as Child Class 'j'
}
	
}
