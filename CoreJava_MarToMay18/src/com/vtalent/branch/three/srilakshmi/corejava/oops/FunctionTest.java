package com.vtalent.branch.three.srilakshmi.corejava.oops;

class Function
{
	int i,j,k,l;
	Function(int a,int b)
	{
		this.i=a+b;
		this.i=this.i++;
		System.out.println(i);
		this.i=this.i+1;
		System.out.println(i);
		this.j=a+b;
		this.j=++this.j;
		System.out.println(j);
		this.j=1+this.j;
		System.out.println(j);
		this.k=a+b;
		this.k=this.k--;
		System.out.println(k);
		this.k=this.k-1;
		System.out.println(k);
		this.l=a+b;
		this.l=--this.l;
		System.out.println(l);
		this.l=1-this.l;
		System.out.println(l);
	}
}
public class FunctionTest 
{
	public static void main(String args[])
	{
		Function f=new Function(2,3);
		System.out.println(f.i);
		System.out.println(f.j);
		System.out.println(f.k);
		System.out.println(f.l);
	}

}
