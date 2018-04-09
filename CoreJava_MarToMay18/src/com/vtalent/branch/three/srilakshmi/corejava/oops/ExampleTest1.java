package com.vtalent.branch.three.srilakshmi.corejava.oops;
class Example2
{
	long a,b;
	public int function(long a,long b)
	{
		this.a=a+b;
		this.b=a-b;
		return (int)(this.a+this.b);	
	}
	public int function(int a)
	{
		a=(int) (this.a+a);
		return a;
	}
}


class Example6 extends Example2
{
	long b;
	public int function(int a)
	{
		a=(int)b+a;
		return a;
		
	}
}
public class ExampleTest1 
{
	public static void main(String args[])
	{
		Example6 eo=new Example6();
		eo.a=10;
		eo.b=5;
		int a=eo.function(5);
		int b=eo.function(a,a+a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(eo.a);
		System.out.println(eo.b);
		
	}

}
