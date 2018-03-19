package com.vtalent.branch.three.srilakshmi.corejava.oops;

public class Example1 
{
	int a,b;
	Example1()
	{
		a=5;b=5;	
	}
	Example1(int a)
	{
		a=a+b;
		b=a;
	}
	Example1(int a,int b)
	{
		a=a+b;
		b=a-b;
	}
	public static int function(int a)
	{
		Example1 e=new Example1();
		Example1 e1=new Example1(a);
		Example1 e2=new Example1(5,a+a);
		e1.a=a+e.a;
		e2.b=e1.a+e1.b;
		return e1.a+e1.b;
		
	}
	public static void main(String args[])
	{
		int e=function(5);
		System.out.println(e);
	}

}
