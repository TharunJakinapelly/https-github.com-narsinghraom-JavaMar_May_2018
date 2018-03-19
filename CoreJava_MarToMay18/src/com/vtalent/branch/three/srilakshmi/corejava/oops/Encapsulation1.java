package com.vtalent.branch.three.srilakshmi.corejava.oops;
public class Encapsulation1
{
	//creating private variables
	private int Eid;
	private String Ename;
	private double Esalary;
	
	//creating setters and getters
	public int getEid()
	{
		return Eid;
	}
	public void setEid(int eid) 
	{
		this.Eid = eid;
	}
	public String getEname()
	{
		return Ename;
	}
	public void setEname(String ename) 
	{
		this.Ename = ename;
	}
	public double getEsalary() 
	{
		return Esalary;
	}
	public void setEsalary(double esalary) 
	{
		this.Esalary= esalary;
	}
	
	public static void main(String args[])
	{
		Encapsulation1 e=new Encapsulation1();
		e.setEid(10);
		e.setEname("Devansh");
		e.setEsalary(25000);
		System.out.println("employee id is:"+e.getEid());
		System.out.println("employee name is:"+e.getEname());
		System.out.println("employee salary is:"+e.getEsalary());
	}

}
