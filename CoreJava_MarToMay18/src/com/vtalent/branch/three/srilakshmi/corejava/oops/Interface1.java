package com.vtalent.branch.three.srilakshmi.corejava.oops;
interface Abc
{
	public static final float pi=3.14f;
	public void function(int i);
	public abstract void function(float f1);
	}
abstract class ExampleFive implements Abc
{
	public void function()
	{
		
	}
	
}
class ExampleSix extends ExampleFive
{

	public void function(int i) {
		i=(int)pi+i;
		System.out.println(i);
		}
public void function(float f1) 
	{
		f1=pi+f1;
		System.out.println(f1);
		//pi=f1;
	}
		
	}
	public class Interface1 {
		public static void main(String[] args) {
			Abc abc=new ExampleSix();
			abc.function(5);
			abc.function(1.5f);
			//abc.function();
		}

}
