package com.vtalent.branch.three.srilakshmi.corejava.oops;
public class overLoad
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
	public static void main(String args[])
	{
		overLoad ol=new overLoad();
		int k=ol.methodOne(2,5);
		double d=ol.methodOne(2.5,5.2);
		ol.methodOne();
		System.out.println(k);
		System.out.println(d);
	}
}


