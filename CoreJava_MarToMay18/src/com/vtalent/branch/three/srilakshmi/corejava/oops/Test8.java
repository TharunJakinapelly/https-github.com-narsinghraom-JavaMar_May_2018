package com.vtalent.branch.three.srilakshmi.corejava.oops;
class A1
{
	int i,j;
	public void function(int i)
	{
		this.i=i+i;
		j=this.i;
	}
	
}
class B1 extends A1
{
	int j;
	public void function(int i,int j)
	{
		this.i=i+j+this.i;
		this.j=super.j+j;
	}
public void function(int j)
{
	this.i=this.i+j;
	this.j=this.j+j;
	}
}
class C1 extends B1
{
	public void function(int i,int j)
	{
		this.i=this.i+i;
		this.j=this.j+j;
		}
	public void function()
	{
		this.i=this.i+this.j;
		this.j=this.j+this.i;
	}
}
public class Test8 {
	public static void main(String[] args) {
		A1 a=new C1();
		a.function(2);
		//a.function(2,3);
		//a.function();
		System.out.println(a.i);
		System.out.println(a.j);
		A1 a1=new B1();
		a1.function(2);
		//a1.function(2,3);
		//a1.function();
		System.out.println(a1.i);
		System.out.println(a1.j);
		B1 b=new C1();
		//b.function();
		b.function(2);
		b.function(2, 3);
		System.out.println(b.i);
		System.out.println(b.j);
		//b.function();
		//C c=new A();
		//C c1=new B();
		//B b2=new A1();
		}
}
