/*
 * 7.Write a program to find the common elements in three sorted arrays.
 */
package com.Assingnment63.mix;

public class FindCommonEle 
{
	public static void isMerge(int a[],int b[],int c[])
	{
		int d[]=new int[a.length+b.length+c.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			d[x++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			d[x++]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			d[x++]=c[i];
		}
		System.out.println("Given elements is: ");
		for(int i=0;i<d.length;i++)
		{
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					System.out.print(d[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {26,4,3,5,6,7};
		int b[]= {4,2,5,6,76,53,};
		int c[]= {3,5,6,3,7,8};
		isMerge(a, b, c);
	}
}

