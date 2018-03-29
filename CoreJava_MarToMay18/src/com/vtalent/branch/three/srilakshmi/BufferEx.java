package com.vtalent.branch.three.srilakshmi;
import java.io.*;
public class BufferEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter EmployeeId");
		String empid=br.readLine();
		System.out.println("please enter Employee name");
		String ename=br.readLine();
		System.out.println("please enter employee salary");
		String esalary=br.readLine();
		Double d1=new Double(esalary);
		double salary=d1.doubleValue();
		System.out.println("empid:"+empid);
		System.out.println("ename:"+ename);
		System.out.println("esalary:"+esalary);
		}
}
