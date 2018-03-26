package com.vtalent.branch.three.srilakshmi.corejava.oops;

class Test9 {
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
class Second extends Test9
{
	 int i;
	 public int function(int i)
	 {
	 this.i=this.i+i;
	 super.i=super.i+i;
	 return super.i;
}
}
  public class First1
{
	 public static void main(String[] args) {
		Test9 f1=new Test9();
		int k=f1.function(2,3);
		System.out.println(k);
		System.out.println(Test9.f1);
		Second s=new Second();
		int m=s.function(k);
		System.out.println(m);
		System.out.println(s.i);
		System.out.println(s.j);
	 }
}