package com.vtalent.branch.three.srilakshmi;

public class LocalInnerClass {
	int var=5;
	public void function()
	{
		float f=0.5f;
		class Local
		{
			public void function(int var)
			{
				var=var+(int)f;
				this.var=var;
			}
		}
		Local l=new Local();
		l.function(5);
	}
	public static void main(String[] args) {
		LocalInnerClass lc=new LocalInnerClass();
		lc.function();
		System.out.println(lc.var);
	}

}
