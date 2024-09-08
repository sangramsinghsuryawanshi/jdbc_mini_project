package com.Assingnment63.mix;
class SynchroKey
{
	static int x;
	public synchronized static void isPrime(int a[])
	{
		if(x<=0)
		{
			System.out.println("Prime number: ");
			for(int i=0;i<a.length;i++)
			{
				int c=1;
				for(int j=1;j<=i;j++)
				{
					if(a[i]%j==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					x++;
					System.out.println(a[i]+" ");
				}
			}
		}
		else
		{
			System.out.println("Not Prime number: ");
			for(int i=0;i<a.length;i++)
			{
				int c=1;
				for(int j=1;j<=i;j++)
				{
					if(a[i]%j==0)
					{
						c++;
					}
				}
				if(c!=2)
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}
}
public class SynchronizedKeyword extends Thread
{
	int a[];
	SynchronizedKeyword(int a[])
	{
		this.a=a;
	}
	@Override
	public void run() 
	{
		SynchroKey.isPrime(a);
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		SynchronizedKeyword sk = new SynchronizedKeyword(a);
		sk.start();
		
		SynchronizedKeyword sk1 = new SynchronizedKeyword(a);
		sk1.start();
	}
}
