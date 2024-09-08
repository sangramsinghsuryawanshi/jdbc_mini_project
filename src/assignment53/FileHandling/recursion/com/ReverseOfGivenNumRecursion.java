package assignment53.FileHandling.recursion.com;

import java.util.Scanner;

public class ReverseOfGivenNumRecursion 
{
	static int rem=0;
	static int rev=0;
	public static int isReverse(int n)
	{
		if(n==0)
		{
			return rev;
		}
		else
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			return isReverse(n);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n= sc.nextInt();
		System.out.println("Given reverse of number is: "+isReverse(n));
	}

}
