package com.vtalent.branch.three.srilakshmi.corejava.oops;
interface Abc1
{
	public abstract void function(int i);
	public abstract int function(int i,int j);
	}
interface Xyz1
{
	public abstract int function(float f);
	}
interface Example12 extends Abc1,Xyz1
{
	
}
class AbcImp implements Abc1
{
	int i,j;
	public void function(int i)
	{
		System.out.println(this.i);
	this.i=this.i+i;
	
	}
	public int function(int i,int j)
	{
		this.i=this.i+i;
		this.j=this.j+j;
		return i+j;
	}
}
class XyzImp extends AbcImp implements Xyz1
{
	public int function(float f)
	{
		return(int)f;
	}
	
}
class ExampleImp extends XyzImp implements Example12
{

	
}
public class Interface2 {
	public static void main(String[] args) {
		
		Abc1 abc=new XyzImp();
		//abc.function(1.5f);
		abc.function(2);
		abc.function(2,3);
		
		//System.out.println(abc.i);
		//System.out.println(abc.j);
		//Xyz1 Xyz=new AbcImp();
		Xyz1 xyz1=new XyzImp();
		xyz1.function(1.5f);
		//xyz1.function(2);
		//xyz1.function(1, 5);
		Abc1 abc1=new AbcImp();
		abc1.function(2);
		abc1.function(2, 5);
		//abc1.function(1.0f);
		ExampleImp e1=new ExampleImp();
		e1.function(1.5f);
		e1.function(2);
		e1.function(2, 5);
		
		
		
	}

}
