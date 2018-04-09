package com.vtalent.branch.three.srilakshmi.corejava.oops;

public  class Demo 
{ 
	
	 int i,j;
	 Demo()
	 {
		 i=i+2;
		 j=j+4;
	 }
	 Demo(int i)
	 {
		 this.i=this.i+i;
		 j=this.j+i;
	 }
	 Demo(int i,int j)
	 {
		 this.i=this.i+i;
		 this.j=this.j+j;
	 }
		 public static void main(String args[])
		 {
			 
			 Demo d1=new Demo();
			 Demo d2=new Demo(2);
			 Demo d3=new Demo(2,5);
			 System.out.println(d1.i);
			 System.out.println(d1.j);
			 System.out.println(d2.i);
			 System.out.println(d2.j);
			 System.out.println(d3.i);
			 System.out.println(d3.j);
		 }
}

