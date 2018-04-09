package com.vtalent.branch.three.srilakshmi;
class Outer2
{
	private  int var=5;
	public  int function(int var)
	{
		var=var+var;
		return var;
	}
	static class Inner2
	{
		Outer2 o2=new Outer2();
		public void function()
		{
			o2.var=o2.var+5;
			
			o2.function(o2.var);
	      System.out.println(o2.var);	
	     }//method closing
	}//inner cls closing
}//outer cls closing

public class StaticInnerClass1 {
	public static void main(String[] args) {
	Outer2.Inner2 in=new Outer2.Inner2();
	in.function();
	//Outer1.function(5);
	}

}



