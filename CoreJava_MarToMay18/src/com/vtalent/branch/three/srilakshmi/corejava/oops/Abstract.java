package com.vtalent.branch.three.srilakshmi.corejava.oops;
abstract class Example3
{
	int i;
	public void function(int i)
	{
		this.i=i+i;
	}
	public abstract void function();
}
class ExampleFour extends Example3
{
	public void function()
	{
		function(5);
	}
}

public class Abstract {
	public static void main(String[] args) {
		ExampleFour e1=new ExampleFour();
		e1.function();
		System.out.println(e1.i);
	}

}
