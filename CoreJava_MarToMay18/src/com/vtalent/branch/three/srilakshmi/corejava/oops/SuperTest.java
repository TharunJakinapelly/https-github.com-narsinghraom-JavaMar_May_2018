package com.vtalent.branch.three.srilakshmi.corejava.oops;
class Super
{
	long a,b;
	public int function(long a,long b)
	{
		this.a=a+b;
		this.b=a-b;
		return (int) (this.a+this.b);
	}
	public int function(int a)
	{
		  a=(int) (this.a+a);
		  return a;
	}
}
class SuperOne extends Super
{
	long b;
	public int function(int a)
	{
		int c=super.function(a);
		a=(int) (b+c+a);
		super.a=a;
		return a;
	}
}
public class SuperTest 
{
	public static void main(String args[])
	{
		SuperOne so=new SuperOne();
		so.a=10;
		so.b=5;
		int a=so.function(5);
		int b=so.function(a,a+a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(so.a);
		System.out.println(so.b);
	}
}

