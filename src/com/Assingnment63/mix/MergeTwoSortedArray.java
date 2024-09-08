/*
 * 6.Implement a function to merge two sorted arrays into one sorted array.
 */
package com.Assingnment63.mix;

import java.util.Arrays;

public class MergeTwoSortedArray 
{
	public static int[] isMerge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[x++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[x++]=b[i];
		}
		Arrays.sort(c);
		return c;
	}
	public static void main(String[] args) 
	{
		int a[]= {26,4,3,5,6,7};
		int b[]= {4,2,5,6,76,53,};
		System.out.println("Merged Sorted array: \n"+Arrays.toString(isMerge(a, b)));
	}
}
