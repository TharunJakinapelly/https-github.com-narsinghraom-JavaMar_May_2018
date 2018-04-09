package com.vtalent.branch.three.srilakshmi;

public class PrimeNumbers 
{
	
	public static void main(String[] args) 
	{
		int sum=0;
		boolean isPrime=true; 
		for(int i=20;i<60;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
		
			if(isPrime)
			{
				System.out.println(i+",");
				
				sum=sum+i;
			}
			else
			{
				isPrime=true;
			}
		}
	}
}
		


