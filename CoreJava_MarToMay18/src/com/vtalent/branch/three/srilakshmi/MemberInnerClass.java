package com.vtalent.branch.three.srilakshmi;
class Outer
{
	private int var=5;
	public int function(int var)
	{
		this.var=this.var+var;
		return this.var;
	}
	class Inner
	{
		
		public void function()
		{
			var=var+5;
			Outer o=new Outer();
			int var1 = o.function(5);
	      System.out.println(var1);	
	     }
	}
}

public class MemberInnerClass {
	public static void main(String[] args) {
		//Outer o=new Outer();
		Outer.Inner in=new Outer().new Inner();
		in.function();
		
	}

}
