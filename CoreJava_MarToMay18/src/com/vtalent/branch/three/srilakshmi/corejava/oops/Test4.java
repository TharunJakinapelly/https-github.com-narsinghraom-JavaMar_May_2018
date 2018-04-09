package com.vtalent.branch.three.srilakshmi.corejava.oops;
class First2
{
	int a,b;
	First2()
	{
		a=5;
		b=a+10;
	}
	public int functionOne(int a)
	{
		this.a=(a*a)+this.a;
		b=this.a+b;
		return a+b;
	}
}
class Second2 extends First2
{
	int c;
	Second2()
	{
		c=5;
	}
	public int function(int c)
	{
		this.c=c+a;
		return this.c+b;
		
	}
}
public class Test4 {
	public static void main(String args[])
	{
		First2 f=new First2();
		int a=f.functionOne(5);
		System.out.println(a);
		System.out.println(f.a);
		System.out.println(f.b);
		Second2 s=new Second2();
		int b=s.functionOne(2);
		int c=s.function(b);
		System.out.println(b+"   "+c);
		System.out.println(s.b);
		System.out.println(s.c);
	}

}

