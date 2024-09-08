/*
 * 8.Write a program to rearrange the array such that all even 
 * numbers appear before odd numbers.
 */
package com.Assingnment63.mix;

import java.util.Arrays;

public class RearrangeArrayEvenFirst 
{
	public static int[] isRearrange(int a[])
	{
		int x=0;
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c[x++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				c[x++]=a[i];
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Given Array is: "+Arrays.toString(isRearrange(a)));
	}
}
