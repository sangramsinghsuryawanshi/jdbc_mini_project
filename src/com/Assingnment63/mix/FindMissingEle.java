/*
 * 3.Write a program to find the missing number in an array of size n-1 with elements from 1 to n.
 */
package com.Assingnment63.mix;

public class FindMissingEle 
{
	public static int isMissing(int a[])
	{
		int first=a[0];
		int last=a[a.length-1];
		int size=a.length+1;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int total=size*(first+last)/2;
		return total-sum;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,9};
		System.out.println("Mssing element is: "+isMissing(a));
	}
}
