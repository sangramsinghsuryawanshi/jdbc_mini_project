package com.Assingnment63.mix;

public class FindSecondMax
{
	public static int isSecMax(int a[])
	{
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secMax=max;
				max=a[i];
			}
			else if(a[i]>secMax && secMax!=max)
			{
				secMax=a[i];
			}
		}
		return secMax;
	}
	public static void main(String[] args) 
	{
		int a[]= {3,5,6,7,8,91,3};
		System.out.println("Second Max: "+isSecMax(a));
	}

}
