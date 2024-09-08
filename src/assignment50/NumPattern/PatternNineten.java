package assignment50.NumPattern;

import java.util.Scanner;

public class PatternNineten 
{

	public static void isNineten(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		PatternNineten.isNineten(n);
	}

}
