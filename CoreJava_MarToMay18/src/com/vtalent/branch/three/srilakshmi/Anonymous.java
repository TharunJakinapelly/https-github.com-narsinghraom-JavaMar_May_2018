package com.vtalent.branch.three.srilakshmi;
abstract class Calculator
{
	public abstract int addition(int x,int y);
}
public class Anonymous {
	public static void main(String[] args) {
	Calculator c=new Calculator()
	{
		public int addition(int x,int y)
		{
			return x+y;
		}
	};
	int k=c.addition(5,6);
	System.out.println(k);
	}

}
