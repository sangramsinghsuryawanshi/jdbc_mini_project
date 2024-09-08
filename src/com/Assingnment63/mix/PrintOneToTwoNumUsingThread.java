/*
 * 
40.	Write a program to create and start two threads that print 
numbers from 1 to 10.

 */
package com.Assingnment63.mix;

public class PrintOneToTwoNumUsingThread extends Thread
{
	int start;
	int end;
	PrintOneToTwoNumUsingThread(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		for(int i=start;i<=end;i++)
		{
			System.out.println(Thread.currentThread().getId()+":"+i);
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		PrintOneToTwoNumUsingThread pot = new PrintOneToTwoNumUsingThread(1,5);
		pot.start();
		pot.join();
		
		PrintOneToTwoNumUsingThread pot1 = new PrintOneToTwoNumUsingThread(6,10);
		pot1.start();
		pot1.join();
		
	}
}
