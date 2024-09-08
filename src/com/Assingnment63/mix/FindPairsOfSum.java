/*
 * 
9.Implement a function to find all pairs in an array that sum up to a specific target.

 */
package com.Assingnment63.mix;

public class FindPairsOfSum 
{
	public static void sumPair(int a[])
	{
		int x=12;
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==x)
				{
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		sumPair(a);
	}
}
