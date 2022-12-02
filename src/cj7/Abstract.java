package cj7;

abstract class AbstractDemo
{
	public void m1()
	{
		System.out.print("abstract m1() method");
	}
}

public class Abstract 
{
	public static void main(String a[])
	{
		AbstractDemo m = new AbstractDemo() {//anonymous subclass 
			
		};
		m.m1();
	}
}
