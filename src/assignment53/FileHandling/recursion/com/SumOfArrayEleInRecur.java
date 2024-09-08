package assignment53.FileHandling.recursion.com;

import java.util.Scanner;

public class SumOfArrayEleInRecur 
{
	public static int isSum(int n[],int ind)
	{
		if(ind==n.length)
		{
			return 0;
		}
		else
		{
			return n[ind]+isSum(n, ind+1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given size: ");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter given number: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given reverse of number is: "+isSum(a,0));
	}

}
