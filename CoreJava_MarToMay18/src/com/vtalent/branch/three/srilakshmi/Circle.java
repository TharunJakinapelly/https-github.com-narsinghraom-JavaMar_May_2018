package com.vtalent.branch.three.srilakshmi;

class Circle1{
	int i,j;
	Circle1()
	{
		this(6);
		System.out.println("from defult");
	}
	Circle1(int i)
	{
		this(2,3);
		this.i=i;
		System.out.println(i);
	}
	Circle1(int i,int j)
	{
	
		this.i=i;
		this.j=j;
		System.out.println(i);
		System.out.println(j);
	}
}
public class Circle {
	public static void main(String args[])
	{
		Circle1 c=new Circle1();
		
	}

}
