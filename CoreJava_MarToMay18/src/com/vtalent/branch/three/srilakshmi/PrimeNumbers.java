package com.vtalent.branch.three.srilakshmi;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		int num = 2 ;
		int count = 0;
		while(count<100)
		{
		for(int i=2;i<=num/2;i++)
		{
	    if(num%i==0)
			System.out.println("not prime");
			}
		System.out.println(num);
		}
		count ++;
	}
		
	}


