package com.vtalent.branch.three.srilakshmi.corejava.oops;
class Demo2
{
	int i,j;
	float f1,f2;
	public void function(int i)
	{
		this.i=i*i;
		j=this.i+i;
	}
		public int function(int i,int j)
		{
			this.i=this.i+(i*j);
			this.j=this.j+this.i;
			return i+j;
		}
		
		public float function(float f1)
		{
			this.f1=f1+f1;
			return f1;
		}
		}
class Demo3 extends Demo2
{
	int i,j;
	public int function(int i,int j)
	{
		this.i=super.i+this.i+i;
		this.j=super.j+this.j+j;
		return this.i+this.j;
	}
	public float function(float f1,float f2)
	{
		this.f1=this.f1+super.f1+f1;
		this.f2=this.f2+f2;
		return f1+f2;
	}
	public float function(float f1)
	{
		this.f1=f1*f1;
		return this.f1;
	}
	}
public class Test6 {
	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.function(2);
		int k=d1.function(2,3);
		float f1=d1.function((float)k);
		System.out.println(k);
		System.out.println(f1);
		Demo3 d2=new Demo3();
		d2.function(3);
		k=d2.function(k, k+1);
		f1=d2.function(f1, f1+1.0f);
		System.out.println(k);
		System.out.println(f1);
	}
		
		
	}


