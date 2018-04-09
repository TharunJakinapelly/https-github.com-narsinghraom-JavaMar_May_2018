package com.vtalent.branch.three.srilakshmi;
class BackUp1
{
	int i,j;
	String s1;
	static String s2;
	static float f1,f2;
	BackUp1()
	{
		s1="info";
		s2="100";
	}
	BackUp1(int i,int j)
	{
		this();
		this.i=i+j;
		this.j=i*j;
		f1=Float.parseFloat(s2);
		}
	public void function(float f1)
	{
		BackUp1.f1=f1+BackUp1.f1;
	}
}
class BackUpOne extends BackUp1
{
	int i,j;
	BackUpOne(int i,int j)
	{
		this.i=this.i+super.i+i;
		this.j=this.j+super.j+j;
	}
	public void function(float f1){
		BackUp1.f1=f1+BackUp1.f1;
	}
	public int function(int i,float f2)
	{
		Integer i1=new Integer(i+this.i);
		BackUp1.s2=BackUp1.s2+""+i1.toString();
		return (int) (f2+BackUp1.f2);
		
		}
	BackUpOne()
	{
		i=2;
		j=3;
	}
}

public class BackUp {
	public static void main(String[] args) {
		BackUpOne b1=new BackUpOne(5,5);
		b1.function(1.5f);
		int k=b1.function(b1.i,(float)b1.j);
		System.out.println(k);
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println(b1.s1);
		System.out.println(BackUp1.f1);
		System.out.println(BackUp1.f2);
		System.out.println(BackUp1.s2);
	}

}
