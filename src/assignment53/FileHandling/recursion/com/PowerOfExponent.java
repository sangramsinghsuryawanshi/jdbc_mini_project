/*
 * Q5.Create a recursive function to find the power of given number.
 */
package assignment53.FileHandling.recursion.com;

import java.util.Scanner;

public class PowerOfExponent 
{
	public static int isPower(int b,int e)
	{
		if(e==0)
		{
			return 1;
		}
		else
		{
			return b* isPower(b, e-1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base: ");
		int b=sc.nextInt();
		System.out.println("Enter exponent: ");
		int e=sc.nextInt();
		System.out.println("Given power of "+b+" is: "+isPower(b, e));

	}

}
