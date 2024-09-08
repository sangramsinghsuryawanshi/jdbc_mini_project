package com.Assingnment63.mix;

import java.util.Arrays;

public class RotateArrayWithKPositon 
{
	public static int[] isRotated(int a[])
	{
		int b[]=new int[a.length];
		int x=0,k=2;
		for(int i=1;i<=k;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(isRotated(a)));
	}
}
