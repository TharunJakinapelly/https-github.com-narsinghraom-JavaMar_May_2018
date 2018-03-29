package com.vtalent.branch.three.srilakshmi;
import java.util.Scanner;


public class ScannerEx {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Emp id");
	int empid=sc.nextInt();
	System.out.println("enter Emp name");
	String ename=sc.next();
	System.out.println("enter emp salary");
	double esalary=sc.nextDouble();
	System.out.println("empid:"+empid);
	System.out.println("ename:"+ename);
	System.out.println("esalary:"+esalary);

	}

}
