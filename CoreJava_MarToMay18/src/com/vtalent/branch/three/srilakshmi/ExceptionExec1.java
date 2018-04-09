package com.vtalent.branch.three.srilakshmi;

import java.util.Scanner;

class AgeException extends Exception
{
	public String toString()
	{
	return "age should be >23";	
	}
}
public class ExceptionExec1 {
public void ageCheck()throws Exception
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age to validate");
	int age=sc.nextInt();
	if(age<23)
	{
	throw new AgeException();
	}
	else
	{
		System.out.println("you are eligible");
	}
	
}
public static void main(String[] args) {
	ExceptionExec1 ee=new ExceptionExec1();
	try
	{
		ee.ageCheck();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
}
}
