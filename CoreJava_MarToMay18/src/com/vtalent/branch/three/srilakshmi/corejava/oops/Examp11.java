package com.vtalent.branch.three.srilakshmi.corejava.oops;

interface Inter1
{
	public abstract void function(int i);
	public abstract int function(int i,int j);
}

interface Inter2
{
	public abstract int function(float f);
}

interface Inter12 extends Inter1, Inter2
{
	
}


public class Examp11 
{
	public static void main(String[] args) {
		Xyz1 xyz1=new XyzImp();
	}
	
}