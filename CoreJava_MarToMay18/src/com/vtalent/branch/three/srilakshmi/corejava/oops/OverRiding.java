package com.vtalent.branch.three.srilakshmi.corejava.oops;

 class overLoad2
{
	int x,y;
	double a,b;
	public int methodOne(int x,int y)
	{
		this.x=x+y;
		this.y=this.x+(x*y);
		int z=this.x+this.y;
		return z;
	}
	public double methodOne(double a,double b)
	{
		this.a=a+b;
		this.b=a-b;
		double c=this.a*this.b;
		return c;
	}
	public void methodOne()
	{
		System.out.println("values of x&y:" +x+y);
		System.out.println("values of a&b:" +a+b);
	}
}
	public class OverRiding extends overLoad2
{
	int x;
	double y;
	public int methodOne(int x,int y)
	{
		this.x=x+y;
		y=this.x+super.y;
		this.x=y;
		super.x=this.x+y;
		int z=this.x+y;
		return z;
		//return 0;
	}
	public double methodOne(double a,double b)
	{
		super.a=a+b;
		super.b=super.a+b;
		double c=a+b;
		return c;
		//return 0;
		
	}
	public void methodOne()
	{
		System.out.println("from default method");
	}
	public static void main(String args[])
	{
		OverRiding or=new OverRiding();
		int z=or.methodOne(5,7);
		or.methodOne(5.5,4.6);
		or.methodOne();
		overLoad2 ol=new overLoad2();
		int i=ol.methodOne(10,20);
		double n=ol.methodOne(20.0,30.0);
		ol.methodOne();
		System.out.println(i);
		System.out.println(n);
		System.out.println(z);
		System.out.println(or.x);
		System.out.println(or.y);
	}
}


