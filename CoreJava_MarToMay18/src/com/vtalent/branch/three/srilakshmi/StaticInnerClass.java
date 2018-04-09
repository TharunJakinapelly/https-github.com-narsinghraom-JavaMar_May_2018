package com.vtalent.branch.three.srilakshmi;

import com.vtalent.branch.three.srilakshmi.Outer.Inner;
class Outer1
{
	private static int var=5;
	public static int function(int var)
	{
		var=var+var;
		return var;
	}
	static class Inner1
	{
		public void function()
		{
			var=var+5;
			
			//function(var);
	      System.out.println(var);	
	     }//method closing
	}//inner cls closing
}//outer cls closing

public class StaticInnerClass {
	public static void main(String[] args) {
	Outer1.Inner1 in=new Outer1.Inner1();
	in.function();
	Outer1.function(5);
	}

}
