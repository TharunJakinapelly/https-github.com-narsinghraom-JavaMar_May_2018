package com.vtalent.branch.three.srilakshmi.corejava.oops;

class Test5 {
	 int i,j;
	 static float f1;
	 public int function(int i,int j)
	 {
		 this.i=i*j;
		 this.j=this.i+j;
		 f1=this.i+this.j;
		 return(int)f1;
	 }
	}
class Second1 extends Test5
{
	 int i;
	 public int function(int i)
	 {
	 this.i=this.i+i;
	 super.i=super.i+i;
	 return super.i;
}
}
class Third extends Second1
{
	int j;
	public int function(int i,int j)
	{
		super.function(i, j);
		this.i=this.i+i;
		this.j=this.j+j;
		return i;
		}
	}
  public class Test3
{
	 public static void main(String[] args) {
		Third t=new Third();
		t.function(2,5);
		int k=t.function(t.j);
		System.out.println(k);
		System.out.println(t.i);
		System.out.println(t.j);
		
	 }
}

