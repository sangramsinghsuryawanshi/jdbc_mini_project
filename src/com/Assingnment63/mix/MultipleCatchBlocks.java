package com.Assingnment63.mix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks 
{
	public void isCatch()
	{
		String a=null;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println(a);
			System.out.println(2/1);
			System.out.println("Enter value: ");
			int s = sc.nextInt();
			System.out.println(s);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		}
		catch(InputMismatchException e1)
		{
			System.out.println(e1);
		}
	}
	public static void main(String[] args) 
	{
		MultipleCatchBlocks c = new MultipleCatchBlocks();
		c.isCatch();
	}
}
