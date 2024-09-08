/*
 * 4. Implement a function to find the maximum product 
 * of two integers in an array.
 */
package com.Assingnment63.mix;

public class FindMaxProduct 
{
	public static int isMaxPro(int a[])
	{
		int product=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++)
		{
			product=a[i]*a[i+1];
			if(product>max)
			{
				max=product;
			}
		}
		
		return max;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println("Max Product is: "+isMaxPro(a));
	}
}
