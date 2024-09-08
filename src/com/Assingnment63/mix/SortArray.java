/*
 * 5.Write a program to sort an array of 0s, 1s, and 2s 
 * without using any sorting algorithm.
 */
package com.Assingnment63.mix;

import java.util.Arrays;

public class SortArray 
{
	public static int[] isSort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int a[]= {0,0,0,2,2,2,1,1,1,1};
		System.out.println("Sorted Array: "+Arrays.toString(isSort(a)));
	}

}
