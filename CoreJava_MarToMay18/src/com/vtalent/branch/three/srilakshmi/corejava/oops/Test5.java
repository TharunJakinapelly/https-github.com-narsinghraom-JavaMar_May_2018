package com.vtalent.branch.three.srilakshmi.corejava.oops;
class Employee5
{
	int employeeId;
	double employeeSalary;
	double annualTax;
	public void setEmployeeId(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public double annualSalary(double employeeSalary)
	{
		employeeSalary=employeeSalary-25000.00;
		this.employeeSalary=employeeSalary;
		return this.employeeSalary;
	}
public double annualSalary(double employeeSalary,double annualTax)
{
	this.employeeSalary=employeeSalary-(employeeSalary*annualTax);
	return this.employeeSalary;
}
}
class HRPayRoll extends Employee5
{
public double annualSalary(double employeeSalary)
{
	int hra=50000;
	float tax=0.3f;
	int meal=3000;
	this.employeeSalary=(employeeSalary)-(hra+meal+(employeeSalary*tax));
	return this.employeeSalary;
	
	
}
}
public  class Test5 {
	public static void main(String[] args) {
		HRPayRoll hr=new HRPayRoll();
		hr.setEmployeeId(100);
		double salaryPackage=hr.annualSalary(400000.00);
		System.out.println(hr.employeeId+" "+salaryPackage);
		
		
	}
}


