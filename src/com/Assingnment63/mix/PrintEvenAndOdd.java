package com.Assingnment63.mix;

public class PrintEvenAndOdd extends Thread 
{
	int a[];
	static int x=0;
	PrintEvenAndOdd(int a[])
	{
		this.a=a;
	}
	public void run() 
	{
		if(x<=0)
		{
			System.out.println("Even: ");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					x++;
					System.out.println(Thread.currentThread().getName()+" "+a[i]+" ");
				}
			}
		}
		else
		{
			System.out.println("Odd: ");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				{
					
					System.out.println(Thread.currentThread().getName()+" "+a[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			int a[]={1,2,3,4,5,6,7,8,9};
			PrintEvenAndOdd peo = new PrintEvenAndOdd(a);
			peo.start();
			peo.join();
			
			PrintEvenAndOdd peo1 = new PrintEvenAndOdd(a);
			peo1.start();
			peo1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
